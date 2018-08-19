package com.inspur.common.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.inspur.common.entity.PaginationBean;

/**
 * 前后翻页的共通组件
 * 
 * @author Administrator
 * 
 */
public abstract class PageAction extends BaseAction implements
		ServletRequestAware, ServletContextAware, ServletResponseAware {
	private static final long serialVersionUID = 1L;

	/**
	 * 分页数据存储用bean
	 */
	private PaginationBean pageBean=new PaginationBean();

	/**
	 * PageBean的get/set方法
	 * 
	 * @return
	 */
	public PaginationBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PaginationBean pageBean) {
		this.pageBean = pageBean;
	}

	/**
	 * 显示第一页数据，默认一页显示的记录条数为10
	 * 
	 * @return
	 * @throws Exception
	 */
	public String openList() {
		//共享session中的pageBEAN
		PaginationBean pageBean=(PaginationBean)session.getAttribute("pageBean");
		this.setPageBean(pageBean);
		
		this.getPageBean().setStartPage(1);// 第一页
		this.getPageBean().setStart(1);// 设置本页的开始记录号

		// 进行检索，得到一览表数据
		List<?> list = getListByPage(this.getPageBean().getStart(), this
				.getPageBean().getPageSize(),  this
				.getPageBean().getPropertyMap());
		this.getPageBean().setList(list);
		// 得到总件数
		long totalCount = getTotalCount(this.getPageBean().getPropertyMap());
		this.getPageBean().setTotalCount(totalCount);
		// 得到总页数
		int pageCount = getPageCount();
		this.getPageBean().setTotalPage(pageCount);
		// 设置本页的最后记录号
		this.getPageBean().setLastRecordNo(getLastRecordNo());
		// 设置前翻页的可用性,第一页的数据,前翻页不可用
		// this.getPageBean().setIs_prev(true);
		// 设置后翻页的可用性，如果是第一页则可用
		// this.getPageBean().setIs_next(false);
		session.setAttribute("pageBean", pageBean);
		return "list";
	}

	/**
	 * 后翻页
	 * 
	 * @return
	 * @throws Exception
	 */
	public String nextPage() {
		//共享session中的pageBEAN
	    pageBean=(PaginationBean)session.getAttribute("pageBean");
		this.setPageBean(pageBean);
		
		int pageCount = getPageCount();// 总页数
		int startPage = this.getPageBean().getStartPage();// 当前页数

		// 可以向后翻页
		if (startPage + 1 <= pageCount) {
			int beforePageLastNo = this.getPageBean().getLastRecordNo();// 得到前一页的最后记录号
			this.getPageBean().setStart(beforePageLastNo + 1);// 设置本页的开始记录号:前一页的记录号+1

			this.getPageBean().setStartPage(++startPage);
			this.getPageBean().setLastRecordNo(getLastRecordNo());// 设置下一页的最后记录号

			// 进行检索，得到一览表数据
			List<?> list = getListByPage(this.getPageBean().getStart(),
					this.getPageBean().getPageSize(), this.getPageBean().getPropertyMap());
			this.getPageBean().setList(list);
			// 设置前翻页的可用性,不是第一页则前翻页可用
			// this.getPageBean().setIs_prev(false);
			// 设置后翻页的可用性，如果是最后页则不可用
			// if (startPage == pageCount) {
			// this.getPageBean().setIs_next(true);
			// }
			session.setAttribute("pageBean", pageBean);
		}
		return "list";
	}

	/**
	 * 前翻页
	 * 
	 * @return
	 * @throws Exception
	 */
	public String prePage() {
		//共享session中的pageBEAN
		PaginationBean pageBean=(PaginationBean)session.getAttribute("pageBean");
		this.setPageBean(pageBean);

		int startPage = this.getPageBean().getStartPage();// 当前页数
		// 可以向前翻页
		if (startPage != 1) {
			int beforePageStartNo = this.getPageBean().getStart();
			this.getPageBean().setStart(
					beforePageStartNo - this.getPageBean().getPageSize());// 设置本页的开始记录号:前一页的开始记录号-一页显示的总页数

			this.getPageBean().setStartPage(--startPage);
			this.getPageBean().setLastRecordNo(getLastRecordNo());// 设置前一页的最后记录号

			// 进行检索，得到一览表数据
			List<?> list = getListByPage(this.getPageBean().getStart(),
					this.getPageBean().getPageSize(), this.getPageBean().getPropertyMap());
			this.getPageBean().setList(list);
		
			session.setAttribute("pageBean", pageBean);
		}
		return "list";
	}
	
	/**
	 * 最后一页
	 * @return
	 */
	public String lastPage() {
		//共享session中的pageBEAN
		PaginationBean pageBean=(PaginationBean)session.getAttribute("pageBean");
		this.setPageBean(pageBean);

		//设置本页的开始记录号：倒数第二页的最后一条记录行号+1
		this.getPageBean().setStart((pageBean.getTotalPage()-1)*pageBean.getPageSize()+1);// 
		this.getPageBean().setStartPage(pageBean.getTotalPage());//设置最后页的页码号

		// 进行检索，得到一览表数据
		List<?> list = getListByPage(this.getPageBean().getStart(), this
				.getPageBean().getPageSize(),  this
				.getPageBean().getPropertyMap());
		this.getPageBean().setList(list);
		// 得到总件数
		long totalCount = getTotalCount(this.getPageBean().getPropertyMap());
		this.getPageBean().setTotalCount(totalCount);
		// 得到总页数
		int pageCount = getPageCount();
		this.getPageBean().setTotalPage(pageCount);
		// 设置本页的最后记录号
		this.getPageBean().setLastRecordNo(getLastRecordNo());

		session.setAttribute("pageBean", pageBean);
		return "list";
	}

	/**
	 * 显示第几页的数据
	 * 
	 * @param page
	 * @return
	 */
	public String goPage() {
		//共享session中的pageBEAN
		PaginationBean pageBean=(PaginationBean)session.getAttribute("pageBean");
		this.setPageBean(pageBean);
		
		String page = request.getParameter("page");// 得到界面上传递过来的转到第几页的页码
		int pageTemp = Integer.parseInt(page);
		this.getPageBean().setStartPage(pageTemp);// 设置转到第几页

		// 设置本页的开始记录号:前一页的开始记录号-一页显示的总页数
		this.getPageBean().setStart(
				(pageTemp - 1) * this.getPageBean().getPageSize() + 1);// 得到前一页的最后记录数+1
		int lastRecordNo = getLastRecordNo();// 转到页的最后一条记录号
		this.getPageBean().setLastRecordNo(lastRecordNo);// 设置下一页的最后记录号

		// 进行检索，得到一览表数据
		List<?> list = getListByPage(this.getPageBean().getStart(), this.getPageBean().getPageSize(),this.getPageBean().getPropertyMap());
		this.getPageBean().setList(list);

		
		session.setAttribute("pageBean", pageBean);
		return "list";
	}

	/**
	 * 检索当前页的数据
	 * 
	 * @return
	 */
	public abstract List<?> getListByPage(int pageNo, int pageSize, Map<String, Object> propertyMap);

	/**
	 * 得到总件数
	 */
	public abstract int getTotalCount(Map<String, Object> propertyMap);

	/**
	 * 得到总页数
	 * 
	 * @param values
	 * @return
	 */
	public int getPageCount() {

		int totalCount = (int) this.getPageBean().getTotalCount();
		int pageSize = this.getPageBean().getPageSize();
		int pageCount = totalCount % pageSize == 0 ? totalCount / pageSize
				: totalCount / pageSize + 1;
		return pageCount;
	}

	/**
	 * 得到本页的最后记录行号
	 * 
	 * @return
	 */
	public int getLastRecordNo() {

		int num = this.getPageBean().getStartPage()
				* this.getPageBean().getPageSize();
		// 如果最后一页不满，则显示实际总记录数
		if (num > (int) this.getPageBean().getTotalCount()) {
			num = (int) this.getPageBean().getTotalCount();
		}
		return num;
	}

}
