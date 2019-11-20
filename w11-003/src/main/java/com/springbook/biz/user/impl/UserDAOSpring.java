package com.springbook.biz.user.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserDAO;
import com.springbook.biz.user.UserVO;

@Repository("userDAO")
public class UserDAOSpring implements UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertUser(UserVO vo) {
		jdbcTemplate.update("insert into users (id, password, name, role) values (?, ?, ?, ?)",
				vo.getId(), vo.getPassword(), vo.getName(), vo.getRole());
	}

	@Override
	public void updateUser(UserVO vo) {
		jdbcTemplate.update("update users set password = ?, name = ?, role = ? where id = ?",
				vo.getPassword(), vo.getName(), vo.getRole(), vo.getId());
	}

	@Override
	public void deleteUser(UserVO vo) {
		jdbcTemplate.update("delete from users where id = ?", vo.getId());
	}

	@Override
	public UserVO getUser(UserVO vo) {
		Object args[] = {vo.getId(), vo.getPassword()};
		return jdbcTemplate.queryForObject("select * from users where id=? and password = ?", args, new UserRowMapper());
	}

	@Override
	public List getUserList() {
		return jdbcTemplate.query("select * from users", new UserRowMapper());
	}

}


class UserRowMapper implements RowMapper<UserVO>{
	public UserVO mapRow(ResultSet rs, int num) throws SQLException{
		UserVO user = new UserVO();
		user.setId(rs.getString("id"));
		user.setPassword(rs.getString("password"));
		user.setName(rs.getString("name"));
		user.setRole(rs.getString("role"));
		return user;
	}
}