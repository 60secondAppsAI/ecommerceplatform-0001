package com.ecommerceplatform.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.ecommerceplatform.domain.Category;
import com.ecommerceplatform.dto.CategoryDTO;
import com.ecommerceplatform.dto.CategorySearchDTO;
import com.ecommerceplatform.dto.CategoryPageDTO;
import com.ecommerceplatform.dto.CategoryConvertCriteriaDTO;
import com.ecommerceplatform.service.GenericService;
import com.ecommerceplatform.dto.common.RequestDTO;
import com.ecommerceplatform.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CategoryService extends GenericService<Category, Integer> {

	List<Category> findAll();

	ResultDTO addCategory(CategoryDTO categoryDTO, RequestDTO requestDTO);

	ResultDTO updateCategory(CategoryDTO categoryDTO, RequestDTO requestDTO);

    Page<Category> getAllCategorys(Pageable pageable);

    Page<Category> getAllCategorys(Specification<Category> spec, Pageable pageable);

	ResponseEntity<CategoryPageDTO> getCategorys(CategorySearchDTO categorySearchDTO);
	
	List<CategoryDTO> convertCategorysToCategoryDTOs(List<Category> categorys, CategoryConvertCriteriaDTO convertCriteria);

	CategoryDTO getCategoryDTOById(Integer categoryId);







}





