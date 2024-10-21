package com.ecommerceplatform.dao;

import java.util.List;

import com.ecommerceplatform.dao.GenericDAO;
import com.ecommerceplatform.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


