package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sri.sbeans.ProductService;

@SpringBootApplication
public class ValueAnnotationApplication {

	public static void main(String[] args) {
		ProductService p = SpringApplication.run(ValueAnnotationApplication.class, args).getBean(ProductService.class);
	    IO.println(p);
	}

}
