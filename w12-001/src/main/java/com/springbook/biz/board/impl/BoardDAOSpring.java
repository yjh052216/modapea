package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardDAO;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.user.UserVO;

//@Repository("boardDAO")
public class BoardDAOSpring implements BoardDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void insertBoard(BoardVO vo) {
		jdbcTemplate.update("insert into board (title, writer, content) values (?, ?, ?)",
				vo.getTitle(), vo.getWriter(), vo.getContent());
	}

	@Override
	public void updateBoard(BoardVO vo) {
		jdbcTemplate.update("update board set title = ?, content = ? where seq = ?",
				vo.getTitle(), vo.getContent(), vo.getSeq());
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		jdbcTemplate.update("delete from board where seq = ?", vo.getSeq());
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		Object args[] = {vo.getSeq()};
		return jdbcTemplate.queryForObject("select * from board where seq=?", args, new BoardRowMapper());
	}

	@Override
	public List getBoardList() {
		return jdbcTemplate.query("select * from board", new BoardRowMapper());
	}

}

class BoardRowMapper implements RowMapper<BoardVO>{
	public BoardVO mapRow(ResultSet rs, int num) throws SQLException{
		BoardVO board = new BoardVO();
		board.setSeq(rs.getInt("seq"));
		board.setTitle(rs.getString("title"));
		board.setWriter(rs.getString("writer"));
		board.setContent(rs.getString("content"));
		board.setRegDate(rs.getDate("regdate"));
		board.setCnt(rs.getInt("cnt"));
		return board;
	}
}
