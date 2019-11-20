package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.user.UserDAO;
import com.springbook.biz.user.UserVO;

public class UserDAOJdbc implements UserDAO {
	/* (non-Javadoc)
	 * @see com.springbook.biz.user.impl.UserDAO#insertUser(com.springbook.biz.user.UserVO)
	 */
	@Override
	public void insertUser(UserVO vo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "1234");
			PreparedStatement stmt = conn.prepareStatement("insert into users values (?, ?, ?, ?)");
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getRole());

			stmt.executeUpdate();

		} catch (Exception e) {
		}
	}

	/* (non-Javadoc)
	 * @see com.springbook.biz.user.impl.UserDAO#updateUser(com.springbook.biz.user.UserVO)
	 */
	@Override
	public void updateUser(UserVO vo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "1234");
			PreparedStatement stmt = conn.prepareStatement("update users set password=?, name=?, role=? where id=?");
			stmt.setString(4, vo.getId());
			stmt.setString(1, vo.getPassword());
			stmt.setString(2, vo.getName());
			stmt.setString(3, vo.getRole());

			stmt.executeUpdate();

		} catch (Exception e) {
		}
	}

	/* (non-Javadoc)
	 * @see com.springbook.biz.user.impl.UserDAO#deleteUser(com.springbook.biz.user.UserVO)
	 */
	@Override
	public void deleteUser(UserVO vo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "1234");
			PreparedStatement stmt = conn.prepareStatement("delete from users where id=?");
			stmt.setString(1, vo.getId());

			stmt.executeUpdate();

		} catch (Exception e) {
		}
	}

	/* (non-Javadoc)
	 * @see com.springbook.biz.user.impl.UserDAO#getUser(com.springbook.biz.user.UserVO)
	 */
	@Override
	public UserVO getUser(UserVO vo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/test","root","1234");
			PreparedStatement stmt = conn.prepareStatement(
					"select * from users where id=?");
			stmt.setString(1, vo.getId());
			
			ResultSet rs = stmt.executeQuery();
			rs.next();
			
			UserVO user = new UserVO();
			user.setId(rs.getString("id"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
			user.setRole(rs.getString("role"));
			
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.springbook.biz.user.impl.UserDAO#getUserList()
	 */
	@Override
	public List getUserList() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/test","root","1234");
			PreparedStatement stmt = conn.prepareStatement(
					"select * from users");
			
			ResultSet rs = stmt.executeQuery();
			
			List userList = new ArrayList();
			
			while(rs.next()){
				UserVO user = new UserVO();
				
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setRole(rs.getString("role"));
				
				userList.add(user);
			}
			
			return userList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
