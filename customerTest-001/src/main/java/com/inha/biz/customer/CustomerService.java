package com.inha.biz.customer;

public interface CustomerService {

	
	public void insertCustomer(CustomerVO vo);
	public void updateCustomer(CustomerVO vo);
	public void deleteCustomer(CustomerVO vo);
	public CustomerVO selectCustomer(CustomerVO vo);

}
