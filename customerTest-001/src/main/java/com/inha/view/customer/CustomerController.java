package com.inha.view.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("updateCustomer.do")
	public String updateCustomer(CustomerVO vo){
		customerService.updateCustomer(vo);
		return "Success.jsp";
	}
	
	@RequestMapping("deleteCustomer.do")
	public String deleteCustomer(CustomerVO vo){
		customerService.deleteCustomer(vo);
		return "Success.jsp";
	}
	
	@RequestMapping("selectCustomer.do")
	public ModelAndView selectCustomer(CustomerVO vo){
		ModelAndView mav = new ModelAndView();
		CustomerVO customer = customerService.selectCustomer(vo);
		mav.addObject("customer", customer);
		mav.setViewName("CustomerSelect.jsp");
		return mav;
	}

}
