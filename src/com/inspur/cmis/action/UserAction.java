package com.inspur.cmis.action;

import com.inspur.cmis.entity.GroupEntity;
import com.inspur.cmis.entity.User;
import com.inspur.cmis.service.GroupService;
import com.inspur.cmis.service.UserService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.entity.JsonResult;
import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 登录 注销操作
 */
public class UserAction extends BaseAction {
	private static final long serialVersionUID = -7113623080043456241L;
	@Autowired
	private UserService userService;

	@Autowired
	private GroupService groupService;

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
		if (dbUser.getIsdelete()!=null && dbUser.getIsdelete()==1){
			request.setAttribute("msg","账号被禁用");
			return INPUT;
		}
		//判断时间
		session.setAttribute("am", DateUtil.getAmOrPm());
		session.setAttribute(Constants.USER, dbUser);
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
		hqlHelper.addWhere(" o.isdelete != 1 ");
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
		User saveUser = (User) session.getAttribute(Constants.USER);
		request.setAttribute("saveUser",saveUser);
		return "resetPwd";
	}
	/**
	 * 用户添加页面跳转
	 * @return
	 */
	public String userAddHtml(){
		//查询所有的机构
		List<GroupEntity> list = groupService.findAllUseable();
		request.setAttribute("groups",list);
		return "userInfoAddHtml";
	}


	/**
	 * 用户添加
	 * @return
	 */
	public String userAdd(){
		//默认设置
		User currentUser = (User) session.getAttribute(Constants.USER);
		user.setCreateduserid(currentUser.getId());
		user.setLocked("0");
		user.setIsdelete(0);
		user.setCreatedTime(new Date());

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
	 * ajax用户修改
	 * @return
	 */
	public String userUpdate(){
		//先ID查询一下再保存 否则其它字段都空
		User dbUser = userService.findObjectById(user.getId());
		JsonResult jsonResult = new JsonResult(0,"修改失败");

		if (IsNullUtils.isNotNull(upBirth,upRole,upSex,upName)){
			dbUser.setBirth(upBirth);
			dbUser.setRoleid(upRole);
			dbUser.setSex(upSex);
			dbUser.setName(upName);
			//修改时间
			dbUser.setModifiedTime(new Date());
			userService.update(dbUser);
			jsonResult = new JsonResult(1,"修改成功");
		}
		result = GsonUtils.toJson(jsonResult);
		return "userUpdate";
	}


	/**
	 * ajax用户删除
	 * @return
	 */
	public String userDelete(){
		JsonResult jsonResult = new JsonResult(0,"删除失败");

		if (IsNullUtils.isNotNull(deletes)){
			userService.deleteAll(deletes);
			jsonResult = new JsonResult(1,"删除成功");
		}
		result = GsonUtils.toJson(jsonResult);
		return "userDelete";
	}

	/**
	 * 禁用用户
	 * @return
	 */
	public String userDisable(){
		JsonResult jsonResult = new JsonResult(0,"禁用失败");

		if (IsNullUtils.isNotNull(deletes)){
			userService.disableAll(deletes);
			jsonResult = new JsonResult(1,"禁用成功");
		}
		result = GsonUtils.toJson(jsonResult);
		return "userDisable";
	}

	/**
	 * 启用用户
	 * @return
	 */
	public String userEnable(){
		JsonResult jsonResult = new JsonResult(0,"启用失败");

		if (IsNullUtils.isNotNull(deletes)){
			userService.enableAll(deletes);
			jsonResult = new JsonResult(1,"启用成功");
		}
		result = GsonUtils.toJson(jsonResult);
		return "userEnable";
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
	///////////ajax返回数据使用/////////////
	private String result;
	private Integer userId;

	///////////更新用户使用/////////////
	private String upRole;
	private Date upBirth;
	private Integer upSex;
	private String upName;
	///////////删除用户使用/////////////
	private String deletes;

	public String getDeletes() {
		return deletes;
	}

	public void setDeletes(String deletes) {
		this.deletes = deletes;
	}

	public String getUpName() {
		return upName;
	}

	public void setUpName(String upName) {
		this.upName = upName;
	}

	public String getUpRole() {
		return upRole;
	}

	public void setUpRole(String upRole) {
		this.upRole = upRole;
	}

	public Date getUpBirth() {
		return upBirth;
	}

	public void setUpBirth(Date upBirth) {
		this.upBirth = upBirth;
	}

	public Integer getUpSex() {
		return upSex;
	}

	public void setUpSex(Integer upSex) {
		this.upSex = upSex;
	}
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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
