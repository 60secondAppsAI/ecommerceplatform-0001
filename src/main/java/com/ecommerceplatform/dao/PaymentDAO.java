package com.ecommerceplatform.dao;

import java.util.List;

import com.ecommerceplatform.dao.GenericDAO;
import com.ecommerceplatform.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


