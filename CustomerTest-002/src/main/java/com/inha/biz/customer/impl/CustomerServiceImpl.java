package com.inha.biz.customer.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.inha.biz.customer.CustomerDAO;
import com.inha.biz.customer.CustomerService;
import com.inha.biz.customer.CustomerVO;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDao;

	@Override
	public void insertCustomer(CustomerVO vo) {
		
		customerDao.insertCustomer(vo);

	}

}
