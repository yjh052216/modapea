package com.inha.view.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inha.biz.book.BookService;
import com.inha.biz.book.BookVO;

@Controller
public class BookController {
	
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("insertBook.do")
	public String insertBook(BookVO vo){
		
		bookService.insertBook(vo);
		
		return "Success.jsp";
		
	}

}
