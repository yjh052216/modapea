package com.inha.biz.customer.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.inha.biz.customer.CustomerDAO;
import com.inha.biz.customer.CustomerVO;

public class CustomerDAOMybatis implements CustomerDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public void insertCustomer(CustomerVO vo) {
		
		
		mybatis.insert("customerDAO.insertCustomer", vo);
		
		
	}

	@Override
	public void updateCustomer(CustomerVO vo) {
	
		
		mybatis.update("customerDAO.updateCustomer", vo);
		
	}
	
	

}
