package com.springbook.biz.user.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springbook.biz.user.UserDAO;
import com.springbook.biz.user.UserVO;

public class userDAOSpring implements UserDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertUser(UserVO vo) {
		jdbcTemplate.update("insert into users (id, password, name, role) value (?,?,?,?)",vo.getId(),vo.getPassword(),vo.getName(),vo.getRole());

	}

	@Override
	public void updateUser(UserVO vo) {
		jdbcTemplate.update("update users set password=?, name=?, role=? where id=?",vo.getPassword(),vo.getName(),vo.getRole(),vo.getId());


	}

	@Override
	public void deleteUser(UserVO vo) {
		jdbcTemplate.update("delete from users where id=?",vo.getId());

	}

	@Override
	public UserVO getUser(UserVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}
