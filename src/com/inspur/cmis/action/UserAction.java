package com.inspur.cmis.action;

import com.inspur.cmis.entity.User;
import com.inspur.cmis.service.UserService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.entity.JsonResult;
import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.DateUtil;
import com.inspur.common.util.HQLHelper;
import com.inspur.common.util.IsNullUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 登录 注销操作
 */
public class UserAction extends BaseAction {
	private static final long serialVersionUID = -7113623080043456241L;
	@Autowired
	private UserService userService;

	/**
	 * 登录
	 * @return
	 * @throws Exception
	 */
	public String doLogin() throws Exception {
		session.setAttribute("user", user);
		//使用user获取传入的参数
		if (IsNullUtils.isContainsNull(user.getLoginName(),user.getPassWord())){
			//用户名密码没有填写
			request.setAttribute("msg","请填写账号或密码");
			return INPUT;
		}
		User dbUser = userService.login(this.user.getLoginName(), this.user.getPassWord());
		if (dbUser==null){
			//用户名Or密码错误
			request.setAttribute("msg","账号或密码错误");
			return INPUT;
		}
		//判断时间
		session.setAttribute("am", DateUtil.getAmOrPm());
		session.setAttribute("user", user);
		return SUCCESS;
	}

	/**
	 * 注销
	 * @return
	 * @throws Exception
	 */
	public String logout() throws Exception {
		session.removeAttribute("user");
		return INPUT;
	}

	/**
	 * 用户列表
	 * @return
	 */
	public String userInfo(){
		//分页查询
		HQLHelper hqlHelper = new HQLHelper(User.class);
		int page = 1;
		if (currentPage!=null && currentPage>0){
			page = currentPage;
		}
		//条件查询
		if (user!=null && user.getId()!=null){
			hqlHelper.addWhere(" o.id = ?",user.getId());
			request.setAttribute("userId",user.getId());
		}
		//名字以 xxx开头的
		if (user!=null && StringUtils.isNotBlank(user.getName())){
			hqlHelper.addWhere(" o.name like ?",user.getName()+"%");
			request.setAttribute("username",user.getName());
		}

		//设置页数
		PaginationBean pageBean = userService.getPageBean(hqlHelper, page);
		request.setAttribute("pageBean",pageBean);
		return "userInfo";
	}

	//页数
	private Integer currentPage;

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * 密码修改页面跳转
	 * @return
	 */
	public String resetPwd(){
		return "resetPwd";
	}
	/**
	 * 用户添加页面跳转
	 * @return
	 */
	public String userAddHtml(){
		return "userInfoAddHtml";
	}


	/**
	 * 用户添加
	 * @return
	 */
	public String userAdd(){
		userService.add(user);
		//重定向到用户列表
		return "userList";
	}

	/**
	 * 用户修改跳转
	 * @return
	 */
	public String userUpdateHtml(){
		User user = userService.findObjectById(userId);
		request.setAttribute("updateUser",user);
		return "userInfoUpdateHtml";
	}

	/**
	 * 用户修改
	 * @return
	 */
	public String userUpdate(){
		userService.update(user);
		//返回结果
		jsonResult.setCode(1);
		jsonResult.setMsg("修改成功");
		return "userInfoUpdate";
	}



	/**
	 * 密码修改
	 * @return
	 */
	public String resetPassWord(){
		if (IsNullUtils.isContainsNull(user.getLoginName(),user.getPassWord(),newPass)){
			request.setAttribute("pwdMsg","信息填写不完整!");
			return "resetPwd";
		}
		User dbUser = userService.login(this.user.getLoginName(), this.user.getPassWord());
		if (dbUser==null){
			//用户名Or密码错误
			request.setAttribute("pwdMsg","原账号或密码不正确!");
			return "resetPwd";
		}
		//设置新密码
		dbUser.setPassWord(newPass);
		//保存
		userService.update(dbUser);
		request.setAttribute("pwdMsg","密码修改成功");
		return "resetPwd";
	}


	private User user;
	private JsonResult jsonResult = new JsonResult();
	private Integer userId;

	public JsonResult getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(JsonResult jsonResult) {
		this.jsonResult = jsonResult;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private String newPass;

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

}
