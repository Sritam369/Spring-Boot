package com.sri.sbeans;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cr")
@Data
@ConfigurationProperties(prefix="comp.sri")
public class CompanyRunner {

	private List<Department>dept;
}
