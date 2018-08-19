package com.inspur.common.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletContextAware, ServletResponseAware {

	private static final long serialVersionUID = 1L;

	protected HttpServletRequest request;
	protected ServletContext application;
	protected HttpServletResponse response;
	protected HttpSession session;


	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		session = request.getSession();
	}

	public void setServletContext(ServletContext application) {
		this.application = application;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
}
