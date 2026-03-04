package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ebs")
public class ElectricityBillingSystem {
  
 
	private BillingStrategy bill;

	public void setBill(BillingStrategy bill) {
		this.bill = bill;
	}
	
	public void showBill(double units) {
		double bills = bill.calculateBill(units);
		System.out.println(bills);
	}
}
