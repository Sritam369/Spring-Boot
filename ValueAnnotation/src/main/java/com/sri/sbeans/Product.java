package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;




@Component("pr")
@Data
public class Product {

	@Value("${product.name}")
	private String name;
	@Value("${product.price}")
	public double price;
	@Value("${product.discount}")
	public double discount;
	
	
}
