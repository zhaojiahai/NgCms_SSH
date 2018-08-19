package com.inspur.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CheckLogin implements Interceptor {

	public void destroy() {
		System.out.println("------CheckLogin.destroy------");
	}

	public void init() {
		System.out.println("------CheckLogin.init------");

	}

	public String intercept(ActionInvocation arg0) throws Exception {

		System.out.println("------CheckLogin.intercept------");

		Map<String, Object> session = ActionContext.getContext().getSession();

		if ("com.inspur.cmis.action.LoginAction".equals(arg0.getAction()
				.getClass().getName())) {
			return arg0.invoke();
		}

		if (session.get("user") != null) {
			return arg0.invoke();
		}

		return "checkLoginFail";
	}

}
