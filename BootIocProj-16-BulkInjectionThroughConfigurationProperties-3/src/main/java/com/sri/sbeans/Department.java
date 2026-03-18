package com.sri.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dp")
@Data
public class Department {

	private int deptId;
	private String deptName;
}
