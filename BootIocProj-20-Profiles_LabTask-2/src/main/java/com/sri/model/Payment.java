package com.sri.model;

import lombok.Data;

@Data
public class Payment {

	private int id;
	private double amount;
	private String method;
}
