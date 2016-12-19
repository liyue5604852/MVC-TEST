package com.liyue.www.service.impl;

import com.liyue.www.bean.User;
import com.liyue.www.dao.IUserDao;
import com.liyue.www.service.IUserService;

public class UserServiceImpl implements IUserService {
	
	private IUserDao userDao;

	@Override
	public boolean verifyUser(User user) {
		
		String pwd = userDao.getPwdByNm(user.getName());
		if(user.getPassword().equals(pwd)) {
			return true;
		}
		return false;
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
}
