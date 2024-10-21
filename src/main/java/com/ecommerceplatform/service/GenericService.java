package com.ecommerceplatform.service;

import com.ecommerceplatform.dao.GenericDAO;

public interface GenericService<T, ID> {

    abstract GenericDAO<T, ID> getDAO();

    T getById(Integer id) ;

}