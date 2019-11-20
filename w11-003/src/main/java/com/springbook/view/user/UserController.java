package com.springbook.view.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.do")
	public ModelAndView getUser(UserVO vo, ModelAndView mav){
		UserVO user;
		try {
			user = this.userService.getUser(vo);
		} catch (EmptyResultDataAccessException e) {
			user = null;
		}
		
		if (user != null) {
			mav.setViewName("getBoardList.do");
		} else{
			mav.setViewName("login.jsp");
		}
		return mav;
	}
	
}
