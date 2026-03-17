package com.sri.sbeans;

import java.util.List;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cp")
@Data
@ConfigurationProperties(prefix="org.nit")
public class Company {

	private String name;
	private String addr;
	private String pincode;
	private String contact;
	
	private String[] branches;
	private List<String> owners;
	private Set<Long>phones;
}
