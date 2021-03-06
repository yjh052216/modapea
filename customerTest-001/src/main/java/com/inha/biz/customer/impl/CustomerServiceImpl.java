package com.inha.biz.customer.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.inha.biz.customer.CustomerDAO;
import com.inha.biz.customer.CustomerService;
import com.inha.biz.customer.CustomerVO;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public void insertCustomer(CustomerVO vo) {
		
		
		customerDAO.insertCustomer(vo);
		
		
	}

	@Override
	public void updateCustomer(CustomerVO vo) {


		customerDAO.updateCustomer(vo);
		
	}

	@Override
	public void deleteCustomer(CustomerVO vo) {


		customerDAO.deleteCustomer(vo);
		
	}

	@Override
	public CustomerVO selectCustomer(CustomerVO vo) {
		
		return customerDAO.selectCustomer(vo);
	}

}
