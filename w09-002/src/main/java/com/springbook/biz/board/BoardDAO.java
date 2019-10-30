package com.springbook.biz.board;

import java.util.List;

public interface BoardDAO {

	void insertBoard(BoardVO vo);

	void updateBoard(BoardVO vo);

	void deleteBoard(BoardVO vo);

	BoardVO getBoard(BoardVO vo);

	List getBoardList();

}