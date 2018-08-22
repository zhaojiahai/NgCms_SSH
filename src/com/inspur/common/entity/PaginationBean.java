package com.inspur.common.entity;

import com.inspur.cmis.entity.Constant;

import java.util.List;
import java.util.Map;


/**
 * @author Administrator
 * 
 */
public class PaginationBean implements Constant {

	/**
	 * 每页显示多少条数据
	 */
	public static int pageSize = PAGE_SIZE_10;
	
	private int showCount= PAGE_SIZE_10;

	private int totalCount;
	private int start;

	private int totalPage;

	/**
	 * 当前页码
	 */
	private int currentPage;

	private int lastRecordNo;
	
	private int startPage;

	private int endPage;
	/**
	 * 检索结果存储
	 */
	private List<?> list;

	/**
	 * 存储检索条件
	 */
	private Map propertyMap = null;


	public PaginationBean(int currentPage, int pageSize, int recordCount,List recordList) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = recordCount;
		this.list = recordList;

		totalPage = (this.totalCount + this.pageSize - 1) / this.pageSize;//计算页数

		if(totalPage <= 10){
			this.startPage = 1;
			this.endPage = this.totalPage;
		}else{
			this.startPage = this.currentPage - 4;
			this.endPage = this.currentPage + 5;

			if(this.startPage < 1){
				this.startPage = 1;
				this.endPage = 10;
			}
			if(this.endPage > this.totalPage){
				this.endPage = this.totalPage;
				this.startPage = this.endPage - 9;
			}
		}
	}


	public int getLastRecordNo() {
		return lastRecordNo;
	}

	public void setLastRecordNo(int lastRecordNo) {
		this.lastRecordNo = lastRecordNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	
	public Map getPropertyMap() {
		return propertyMap;
	}

	public void setPropertyMap(Map propertyMap) {
		this.propertyMap = propertyMap;
	}

	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}

}
