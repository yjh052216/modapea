package com.springbook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {

		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		BoardService boardService = (BoardService)container.getBean("boardService");
		
//		BoardVO vo = new BoardVO();
//		vo.setTitle("test4");
//		vo.setWiter("user4");
//		vo.setContent("test4");
//		
//		boardService.insertBoard(vo);
//		
//		
//		
//		
//		BoardVO vo = new BoardVO();
//		vo.setTitle("test400");
//		vo.setContent("test400");
//		vo.setSeq(3);
//		
//		boardService.updateBoard(vo);
		
		
		
		
		BoardVO vo = new BoardVO();
		vo.setSeq(3);
		
		boardService.deleteBoard(vo);
	}

}
