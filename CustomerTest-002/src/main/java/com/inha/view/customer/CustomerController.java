package com.inha.view.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inha.biz.customer.CustomerService;
import com.inha.biz.customer.CustomerVO;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("insertCustomer.do")
	public String insertCustomer(CustomerVO vo){
		
		customerService.insertCustomer(vo);
		
		return "Success.jsp";
		
	}
	

}
