package com.sri.sbeans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component("az")
public class AmazonServices implements ShoppingService{

	
	HashMap<String,List<Double>>map=new HashMap<>(); 
	@Override
	public void addItem(String item, double price) {
		
		map.computeIfAbsent(item, key->new ArrayList<Double>()).add(price);

	}

	@Override
	public void checkout() {
		System.out.println("giving 10% discount...");
		Set<Entry<String, List<Double>>> entrySet = map.entrySet();
		double sum=0.0;
		for(Entry<String, List<Double>> e:entrySet) {
			List<Double> total = e.getValue();
			for(Double t:total) {
				sum+=t;
			}
		}
		System.out.println(sum);
		double t = sum-(sum*0.10);
		System.out.println("your delivery will be completed within 2 days with total price: "+t);
		
	}

	@Override
	public void viewCart() {
		map.forEach((k,v)-> System.out.println(k+" "+v));		
	}

}
