package com.sri.sbeans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

	@Autowired
	@Value("Laptop")
	private String name;
	@Autowired
	@Value("50000")
	private double price;
	@Autowired
	@Value("2")
	private int quantity;
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
}
