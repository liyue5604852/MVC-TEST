package com.liyue.www.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liyue.www.bean.User;
import com.liyue.www.dao.IUserDao;

public class UserDaoImpl implements IUserDao {
	private List<User> userList = new ArrayList<User>();
	private Map<String, String> userMap = new HashMap<String, String>();	
	{
		User user1 = new User();
		user1.setName("liyue");
		user1.setPassword("456");
		userList.add(user1);
		
		userMap.put("liyue", "456");
	}

	@Override
	public String getPwdByNm(String name) {
		
		String pwd = userMap.get(name);
		return pwd;
	}

}
