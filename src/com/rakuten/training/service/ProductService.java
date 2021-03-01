package com.rakuten.training.service;

import com.rakuten.training.domain.Product;

public interface ProductService {

	int addProduct(Product toBeAdded);

	void removeExisting(int id);
	
	

}