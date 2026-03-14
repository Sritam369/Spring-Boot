package com.sri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sri.model.Product;
import com.sri.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	public int insertData(Product p) throws Exception {
		return service.insertData(p);
	}
	public int updateData(Product p) throws Exception {
		return service.updateData(p);
	}
	public int deleteData(int id) throws Exception {
		return service.deleteData(id);
	}
	public List<Product> retrieveData() throws Exception{
		return service.retrieveData();
	}
}
