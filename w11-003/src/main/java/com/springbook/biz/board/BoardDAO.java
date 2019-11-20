package com.springbook.biz.board;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springbook.biz.user.UserVO;

public interface BoardDAO {
	void insertBoard(BoardVO vo);

	void updateBoard(BoardVO vo);

	void deleteBoard(BoardVO vo);

	BoardVO getBoard(BoardVO vo);

	List getBoardList();
}