package com.sri.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dc")
public class DiscountCalculator {

	public double applyDiscount(double price,double discountPercentage) {
		double result = price-(price*discountPercentage/100);
		return result;
	}
}
