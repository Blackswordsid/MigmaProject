package com.patilmasala.service;

import org.springframework.web.multipart.MultipartFile;

import com.patilmasala.model.Product;

public interface ProductService {
	
	void addProduct(Product product, MultipartFile productImmage);

}
