package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {

		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		BoardService boardService = (BoardService)container.getBean("boardService");
		
//		BoardVO vo = new BoardVO();
//		vo.setTitle("test88");
//		vo.setWiter("test88");
//		vo.setContent("test88");
//		
//		boardService.insertBoard(vo);
		
//		
//		
//		
//		BoardVO vo = new BoardVO();
//		vo.setTitle("test8000");
//		vo.setContent("test8000");
//		vo.setSeq(6);
//		
//		boardService.updateBoard(vo);
//		
//		
//		
//		
//		BoardVO vo = new BoardVO();
//		vo.setSeq(6);
//		
//		boardService.deleteBoard(vo);
//		
//		
//		
//		BoardVO vo = new BoardVO();
//		vo.setSeq(1);
//		
//		BoardVO board = boardService.getBoard(vo);
//		System.out.println(board.toString());
//
		List<BoardVO> boardList = boardService.getBoardList();
		for(BoardVO vo1 : boardList){
			System.out.println(vo1.toString());
		}
		
	}

}
