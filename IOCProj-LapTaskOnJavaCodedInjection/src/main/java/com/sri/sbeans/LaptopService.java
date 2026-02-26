package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ls")
public class LaptopService {

	@Autowired
	private Laptop laptop;
	
	public void printLaptopDetails() {
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getProcessor());
		System.out.println(laptop.getRam());
	}
}
