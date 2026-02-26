package com.sri.sbean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tpc")
public class TravelPackageCostCalculator {

	@Autowired
	@Value("5000")
	private double packageCostPerPerson;
	@Autowired
	@Value("4")
	private int numberOfTravellers;
	@Autowired
	@Value("10")
	private double discountPercentage;
	
	public double calculateFinalPackageCost() {
		double total = packageCostPerPerson*numberOfTravellers;
		double discount = total*discountPercentage/100;
		double finalCost = total-discount;
		
		return finalCost;
	}
}
