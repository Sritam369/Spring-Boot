package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pd")
@Data
public class ProductDetails {

	@Value("${product.name}")
	private String name;
	@Value("${product.price}")
	private double price;
	@Value("${product.discount}")
	private int discount;
}
