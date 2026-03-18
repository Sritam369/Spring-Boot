package com.sri.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("s")
@Data
public class Student {

	private int id;
	private String name;
	private double marks;
}
