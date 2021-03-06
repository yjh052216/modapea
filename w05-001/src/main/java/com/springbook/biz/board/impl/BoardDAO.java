package com.springbook.biz.board.impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.springbook.biz.board.BoardVO;

public class BoardDAO {
	
	public void insertBoard(BoardVO vo){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","1234");
			PreparedStatement stmt = conn.prepareStatement("insert into board (title, writer, content) values(?,?,?)");
			
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWiter());
			stmt.setString(3, vo.getContent());
			
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	public void updateBoard(BoardVO vo){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","1234");
			PreparedStatement stmt = conn.prepareStatement("update board set title=?, content=? where seq=?");
			
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getContent());
			stmt.setInt(3, vo.getSeq());
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	public void deleteBoard(BoardVO vo){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","1234");
			PreparedStatement stmt = conn.prepareStatement("delete from board where seq=?");
			
			stmt.setInt(1, vo.getSeq());

			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
public BoardVO getBoard(BoardVO vo){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","1234");
			PreparedStatement stmt = conn.prepareStatement("select * from board where seq=?");
			
			stmt.setInt(1, vo.getSeq());

			ResultSet rs = stmt.executeQuery();
			rs.next();
			
			BoardVO board = new BoardVO();
			board.setSeq(rs.getInt("seq"));
			board.setTitle(rs.getString("title"));
			board.setWiter(rs.getString("writer"));
			board.setContent(rs.getString("content"));
			board.setRegDate(rs.getDate("regdate"));
			board.setCnt(rs.getInt("cnt"));
			return board;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}	

public List getBoardList(){
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","1234");
		PreparedStatement stmt = conn.prepareStatement("select * from board");

		ResultSet rs = stmt.executeQuery();
		
		List boardList = new ArrayList();
		
		while(rs.next()){
			
			BoardVO board = new BoardVO();
			board.setSeq(rs.getInt("seq"));
			board.setTitle(rs.getString("title"));
			board.setWiter(rs.getString("writer"));
			board.setContent(rs.getString("content"));
			board.setRegDate(rs.getDate("regdate"));
			board.setCnt(rs.getInt("cnt"));
			
			boardList.add(board);
		};
		
		return boardList;
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}	

}
