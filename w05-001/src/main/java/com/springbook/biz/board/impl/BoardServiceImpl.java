package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

public class BoardServiceImpl implements BoardService {
	
	private BoardDAO boardDAO;
	
	public BoardDAO getBoardDAO() {
		return boardDAO;
	}

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

	public void insertBoard(BoardVO vo){
		
		this.boardDAO.insertBoard(vo);
		
	}
	
	public void updateBoard(BoardVO vo){
		
		this.boardDAO.updateBoard(vo);
		
	}
	
	public void deleteBoard(BoardVO vo){
		
		this.boardDAO.deleteBoard(vo);
		
	}
	
}
