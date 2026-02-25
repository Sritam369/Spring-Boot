package com.sri.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class EmiCalculator {

	private double laptopPrice;
	private double downPayment;
	private int emiMonths;
	
	public EmiCalculator(double laptopPrice, double downPayment, int emiMonths) {
		super();
		this.laptopPrice = laptopPrice;
		this.downPayment = downPayment;
		this.emiMonths = emiMonths;
	}
	
	public void calculateMonthlyEmi() {
		double remainingAmount=laptopPrice-downPayment;
		double monthlyEmi = remainingAmount/emiMonths;
		System.out.println(monthlyEmi);
	}
	
}
