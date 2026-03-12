package com.sri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sri.model.ProductBean;
import com.sri.service.IProductService;

@Controller("pc")
public class ProductController {

	@Autowired
	private IProductService service;
	
	public int addProduct(ProductBean pb) throws Exception {
		 int product = service.addProduct(pb);
		 return product;
	}
	
	public List<ProductBean> retrieveAllProducts()throws Exception{
		List<ProductBean> allProducts = service.retrieveAllProducts();
		return allProducts;	
	}
	
	public int deleteProduct(int productId)throws Exception{
		return service.deleteProduct(productId);
	}
	
	public int updateProduct(ProductBean pb) throws Exception{
		return service.updateProduct(pb);
	}
}