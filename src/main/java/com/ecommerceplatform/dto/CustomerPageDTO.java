package com.ecommerceplatform.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CustomerPageDTO {

	private Integer page = 0;
	private Long totalElements = 0L;

	private List<CustomerDTO> customers;
}





