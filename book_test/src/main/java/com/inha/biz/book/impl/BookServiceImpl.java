package com.inha.biz.book.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.inha.biz.book.BookDAO;
import com.inha.biz.book.BookService;
import com.inha.biz.book.BookVO;

public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDAO bookDao;

	@Override
	public void insertBook(BookVO vo) {
		
		bookDao.insertBook(vo);

	}

}
