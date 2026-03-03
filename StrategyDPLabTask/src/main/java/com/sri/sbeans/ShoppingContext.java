package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sc")
public class ShoppingContext {

	private ShoppingService shop;
	
	@Autowired	
	public ShoppingContext(@Qualifier("az") ShoppingService shop) {
		this.shop=shop;
	}
	
	public void service(String item,double price) {
		shop.addItem(item, price);
	}
	
	public void view() {
		shop.viewCart();		
	}
	public void check() {
		shop.checkout();
		
	}
	
}
