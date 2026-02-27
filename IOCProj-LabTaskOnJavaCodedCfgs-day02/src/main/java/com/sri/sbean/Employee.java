package com.sri.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	private int id;
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
	private double taxPercentage;
	
	
	
	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public double getBasicSalary() {
		return basicSalary;
	}



	public double getHra() {
		return hra;
	}



	public double getDa() {
		return da;
	}



	public double getTaxPercentage() {
		return taxPercentage;
	}



	@Autowired
	public Employee(@Value("101") int id, @Value("Sritam")String name,@Value("50000") double basicSalary,@Value("5800") double hra,@Value("4000") double da,@Value("10") double taxPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.taxPercentage = taxPercentage;
	}
	
	
}
