package com.sri.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fkt")
public final class Flipkart {
	@Qualifier("bd")
	@Autowired
	private Courier courier;
	
	public Flipkart() {

	}
	
	public String shopping(String items[],double price[]) {
		double bill=0.0;
		for(double b:price) {
			bill+=b;
		}
		int oid = new Random().nextInt(100000);
		String msg = courier.deliver(oid);
		return Arrays.toString(items)+" are shopped having order id "+oid+" of total bill amount"+bill;
	}
}
