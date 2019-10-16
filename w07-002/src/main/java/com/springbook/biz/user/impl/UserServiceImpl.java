package com.springbook.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
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
