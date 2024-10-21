package com.ecommerceplatform.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.ecommerceplatform.domain.Customer;
import com.ecommerceplatform.dto.CustomerDTO;
import com.ecommerceplatform.dto.CustomerSearchDTO;
import com.ecommerceplatform.dto.CustomerPageDTO;
import com.ecommerceplatform.dto.CustomerConvertCriteriaDTO;
import com.ecommerceplatform.service.GenericService;
import com.ecommerceplatform.dto.common.RequestDTO;
import com.ecommerceplatform.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CustomerService extends GenericService<Customer, Integer> {

	List<Customer> findAll();

	ResultDTO addCustomer(CustomerDTO customerDTO, RequestDTO requestDTO);

	ResultDTO updateCustomer(CustomerDTO customerDTO, RequestDTO requestDTO);

    Page<Customer> getAllCustomers(Pageable pageable);

    Page<Customer> getAllCustomers(Specification<Customer> spec, Pageable pageable);

	ResponseEntity<CustomerPageDTO> getCustomers(CustomerSearchDTO customerSearchDTO);
	
	List<CustomerDTO> convertCustomersToCustomerDTOs(List<Customer> customers, CustomerConvertCriteriaDTO convertCriteria);

	CustomerDTO getCustomerDTOById(Integer customerId);







}





