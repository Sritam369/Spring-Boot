package com.sri.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	private Courier courier;
	
	public Flipkart(Courier courier) {
		this.courier=courier;
	}

	public String shopping(String items[],double prices[]) {
		double billAmount=0.0;
		for(double p:prices) {
			billAmount+=p;
		}
		int oid=new Random().nextInt(1000);
		String msg =  courier.deliver(oid);
		return Arrays.toString(items)+" items with bill amount: "+billAmount+"..."+msg;
	}
}
