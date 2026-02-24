package com.sri.sbeans;


import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;
	private String size;
	
	public Tyre() {
		
	}
		
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setSize(String size) {
		this.size=size;
	}
	
	public String showTyreDetails() {
		return "Tyre details: brand="+brand+" , size="+size+"";
	}
}
