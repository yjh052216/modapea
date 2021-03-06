package com.springbook.view.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;


@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("insertBoard.do")
	public String insertBoard(BoardVO vo){
		this.boardService.insertBoard(vo);
		return "Success.jsp";
	}
	
	@RequestMapping("getBoard.do")
	public ModelAndView getBoard(BoardVO vo, ModelAndView mav){
		BoardVO board = this.boardService.getBoard(vo);
		mav.addObject("board", board);
		mav.setViewName("getBoard.jsp");
		return mav;
	}
	
}
