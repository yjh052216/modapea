package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardDAO;
import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
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
	
	public BoardVO getBoard(BoardVO vo){
		return this.boardDAO.getBoard(vo);
	}
	
	public List getBoardList(){
		return this.boardDAO.getBoardList();
	}
}
