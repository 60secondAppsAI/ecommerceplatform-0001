package com.ecommerceplatform.dao;

import java.util.List;

import com.ecommerceplatform.dao.GenericDAO;
import com.ecommerceplatform.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}


