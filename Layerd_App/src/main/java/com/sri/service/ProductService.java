package com.sri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.dao.ProductDao;
import com.sri.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao dao;
	
	public int insertData(Product p) throws Exception {
		int insert =  dao.insertData(p);
		if(insert>0) {
			IO.println("Data Inserted");
		}
		else {
			IO.println("Data not Inserted");
		}
		return insert;
	}
	public int updateData(Product p) throws Exception {
		int insert =  dao.updateData(p);
		if(insert>0) {
			IO.println("Data Updated");
		}
		else {
			IO.println("Data not Updated");
		}
		return insert;
	}
	public int deleteData(int id) throws Exception {
		int insert =  dao.deleteData(id);
		if(insert>0) {
			IO.println("Record Deleted");
		}
		else {
			IO.println("Record not Deleted");
		}
		return insert;
	}
	public List<Product> retrieveData() throws Exception{
		List<Product> list =  dao.getData();
		list.forEach(product->{
			IO.println(product.getId());
			IO.println(product.getName());
			IO.println(product.getDesc());
			IO.println(product.getPrice());
			
			
		});
		
		return list;
	}
}
