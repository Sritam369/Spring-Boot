package com.sri.service;

import java.util.List;

import com.sri.model.ProductBean;

public interface IProductService {

	int addProduct(ProductBean pb)throws Exception;
	List<ProductBean> retrieveAllProducts() throws Exception;
	int deleteProduct(int productId)throws Exception;
	int updateProduct(ProductBean pb) throws Exception;
}
