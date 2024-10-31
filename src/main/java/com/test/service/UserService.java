package com.test.service;

import java.util.List;

import com.test.dao.UserDAO;
import com.test.vo.UserVO;

public class UserService {
	private UserDAO uDao =new UserDAO();
	
	public List<UserVO> getUsers(){
		return uDao.getUsers();
	}
}
	
