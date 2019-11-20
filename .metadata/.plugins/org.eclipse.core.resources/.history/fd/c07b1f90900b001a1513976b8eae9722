package com.springbook.biz.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardDAO;
import com.springbook.biz.board.BoardVO;


@Repository("boardDAO")
public class BoardDAOMybatis implements BoardDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);

	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

}
