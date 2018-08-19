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
	 * һҳ��ʾ�ļ���
	 */
	private int pageSize = PAGE_SIZE_10;
	
	private int showCount= PAGE_SIZE_10;

	/**
	 * �ܼ���
	 */
	private long totalCount;

	/**
	 * ��ʼ����
	 */
	private int start;

	/**
	 * ��ҳ��
	 */
	private int totalPage;

	/**
	 * ��ǰҳ��
	 */
	private int currentPage;

	/**
	 * ��ҳ�����һ����¼��
	 */
	private int lastRecordNo;
	
	/**
	 * ��ʾ��ʼҳ��
	 */
	private int startPage;

	/**
	 * ��ʾ����ҳ��
	 */
	private int endPage;

	/**
	 * ��������洢
	 */
	private List<?> list;


	/**
	 * �洢��������
	 */
	private Map propertyMap = null;
	
	

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

	public void setTotalCount(long totalCount) {
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
