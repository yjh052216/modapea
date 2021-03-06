package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.springbook.biz.board.BoardVO;


public class BoardDAO {

	
	public void insertBoard(BoardVO vo){
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","1234");
		
			PreparedStatement stmt = conn.prepareStatement("insert into board (title,writer,content) values (?,?,?)");
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
