package com.inspur.cmis.service;


import com.inspur.cmis.entity.User;

public interface LoginService {
	
	public User login(String loginName, String password);

}
