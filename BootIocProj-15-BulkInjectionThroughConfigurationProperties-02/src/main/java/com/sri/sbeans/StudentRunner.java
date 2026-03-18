package com.sri.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("sr")
@Data
@ConfigurationProperties(prefix="student.sri")
public class StudentRunner {

	private int id;
	private String name;
	private String course;
	private double fee;
}
