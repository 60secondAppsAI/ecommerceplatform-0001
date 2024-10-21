package com.ecommerceplatform.dao;

import java.util.List;

import com.ecommerceplatform.dao.GenericDAO;
import com.ecommerceplatform.domain.OrderItem;





public interface OrderItemDAO extends GenericDAO<OrderItem, Integer> {
  
	List<OrderItem> findAll();
	






}


