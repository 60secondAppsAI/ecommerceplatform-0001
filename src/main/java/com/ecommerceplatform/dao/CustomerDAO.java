package com.ecommerceplatform.dao;

import java.util.List;

import com.ecommerceplatform.dao.GenericDAO;
import com.ecommerceplatform.domain.Customer;





public interface CustomerDAO extends GenericDAO<Customer, Integer> {
  
	List<Customer> findAll();
	






}


