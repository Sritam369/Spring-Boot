package com.sri.sbeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

@Component("fp")
public class FlipkartServices implements ShoppingService {
	
	HashMap<String,List<Double>>map=new HashMap<>(); 
	@Override
	public void addItem(String item, double price) {
		
		map.computeIfAbsent(item, key->new ArrayList<Double>()).add(price);
	}

	@Override
	public void checkout() {
		System.out.println("giving 5% discount...");
		Set<Entry<String, List<Double>>> entrySet = map.entrySet();
		double sum=0.0;
		for(Entry<String, List<Double>> e:entrySet) {
			List<Double> total = e.getValue();
			for(Double t:total) {
				sum+=t;
			}
		}
		if(sum<500) {
			sum+=50;
		}
		double t = sum-(sum*0.05);
		System.out.println("your delivery will be completed within 3-5 days with total price: "+t);
		
	}

	@Override
	public void viewCart() {
		map.forEach((k,v)-> System.out.println(k+" "+v));		
	}
}
