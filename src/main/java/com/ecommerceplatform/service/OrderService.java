package com.ecommerceplatform.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.ecommerceplatform.domain.Order;
import com.ecommerceplatform.dto.OrderDTO;
import com.ecommerceplatform.dto.OrderSearchDTO;
import com.ecommerceplatform.dto.OrderPageDTO;
import com.ecommerceplatform.dto.OrderConvertCriteriaDTO;
import com.ecommerceplatform.service.GenericService;
import com.ecommerceplatform.dto.common.RequestDTO;
import com.ecommerceplatform.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface OrderService extends GenericService<Order, Integer> {

	List<Order> findAll();

	ResultDTO addOrder(OrderDTO orderDTO, RequestDTO requestDTO);

	ResultDTO updateOrder(OrderDTO orderDTO, RequestDTO requestDTO);

    Page<Order> getAllOrders(Pageable pageable);

    Page<Order> getAllOrders(Specification<Order> spec, Pageable pageable);

	ResponseEntity<OrderPageDTO> getOrders(OrderSearchDTO orderSearchDTO);
	
	List<OrderDTO> convertOrdersToOrderDTOs(List<Order> orders, OrderConvertCriteriaDTO convertCriteria);

	OrderDTO getOrderDTOById(Integer orderId);







}





