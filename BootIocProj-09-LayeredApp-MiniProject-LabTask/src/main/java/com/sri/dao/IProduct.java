package com.sri.dao;

import java.util.List;

import com.sri.model.ProductBean;

public interface IProduct {

	int insertData(ProductBean pb)throws Exception;
	List<ProductBean> getAllProducts() throws Exception;
	int deleteProduct(int productId)throws Exception;
	int updateProduct(ProductBean pb) throws Exception;
}
