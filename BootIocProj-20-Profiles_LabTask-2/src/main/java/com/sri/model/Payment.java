package com.sri.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Payment {

	private int id;
	private double amount;
	private String method;
}
