package com.liyue.www.action;

import com.liyue.www.bean.User;
import com.liyue.www.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String name;
	private String password;
	
	private IUserService userService;
	

	@Override
	public String execute() throws Exception {
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		if(userService.verifyUser(user)){
			return SUCCESS;
		}
		return ERROR;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
