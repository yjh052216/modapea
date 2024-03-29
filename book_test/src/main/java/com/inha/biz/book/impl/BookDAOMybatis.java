package com.inha.biz.book.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.inha.biz.book.BookDAO;
import com.inha.biz.book.BookVO;

public class BookDAOMybatis implements BookDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public void insertBook(BookVO vo) {
		mybatis.insert("BookDAO.insertBook", vo);

	}

}
