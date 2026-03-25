package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ProductService {

	@Autowired
	private Product p;
	@Value("#{pr.price-pr.discount}")
	private double result;
}
