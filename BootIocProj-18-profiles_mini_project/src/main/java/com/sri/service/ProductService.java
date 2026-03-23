package com.sri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.dao.IProduct;
import com.sri.model.ProductBean;

@Service("ps")
public class ProductService implements IProductService {

	@Autowired
	private IProduct product;
	
	@Override
	public int addProduct(ProductBean pb) throws Exception {
		 int insertData = product.insertData(pb);
		 if(insertData>0) {
			 IO.println("Data inserted successfully!!!");
		 }
		 else {
			 IO.println("Data not inserted!!!");
		 }
		 return insertData;
	}
	
	public List<ProductBean> retrieveAllProducts() throws Exception{
		List<ProductBean> list = product.getAllProducts();
		list.forEach(p-> {
			IO.println(p.getProductId());
			IO.println(p.getProductName());
			IO.println(p.getDescription());
			IO.println(p.getPrice());
		});
		
		return list;
	}
	
	public int deleteProduct(int productId)throws Exception{
		int deleteProduct = product.deleteProduct(productId);
		if(deleteProduct>0)
		IO.println("Product with id: "+productId+" deleted");
		else {
			IO.println("Product with id: "+productId+" not found");			
		}
		return deleteProduct;
	}

	public int updateProduct(ProductBean pb) throws Exception{
		int row = product.updateProduct(pb);
		if(row>0) {
			IO.println("Product with "+pb.getProductId()+" updated");
		}
		else {
			IO.println("Product with id: "+pb.getProductId()+" not found");		
		}
		return row;
	}

}
