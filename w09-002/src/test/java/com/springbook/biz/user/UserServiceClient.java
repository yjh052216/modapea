package com.springbook.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

public class UserServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)container.getBean("userService");
		
//		UserVO vo = new UserVO();
//		vo.setId("user55");
//		vo.setPassword("user55");
//		vo.setName("������");
//		vo.setRole("admin");
//		
//		userService.insertUser(vo);
//		
//		
//		UserVO vo = new UserVO();
//		vo.setId("user99");
//		vo.setPassword("user77");
//		vo.setName("�̼���");
//		vo.setRole("admin");
//		
//		userService.updateUser(vo);
//		
//		UserVO vo = new UserVO();
//		vo.setId("user99");
//		
//		userService.deleteUser(vo);
//		
//		
//		UserVO vo = new UserVO();
//		vo.setId("user55");
//		
//		UserVO user = userService.getUser(vo);
//		System.out.println(user.toString());
//		
		List<UserVO> userList = userService.getUserList();
		for(UserVO vo1 : userList){
			System.out.println(vo1.toString());
	}

}
}
