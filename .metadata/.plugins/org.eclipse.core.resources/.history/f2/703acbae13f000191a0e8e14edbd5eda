package com.springbook.biz.user.impl;

import java.util.List;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	public void insertUser(UserVO vo){
		userDAO.insertUser(vo);
	}
	public void updateUser(UserVO vo){
		userDAO.updateUser(vo);
	}
	public void deleteUser(UserVO vo){
		userDAO.deleteUser(vo);
	}
	public UserVO getUser(UserVO vo){
		return userDAO.getUser(vo);
	}
	public List getUserList(){
		
		return userDAO.getUserList();
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	

}
