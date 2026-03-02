package com.sri.sbeans;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
public class VoterEligibilityChecking {

	@Autowired
	@Value("${voter.id}")
	private String id;
	@Autowired
	@Value("${voter.name}")
	private String name;
	@Autowired
	@Value("${voter.age}")
	private Integer age;
	private Date verifiedOn;
	
	public VoterEligibilityChecking() {
		
	}
	
	@PostConstruct
	public void myInit() {
		 verifiedOn = new Date(21-05-2025);
		if(name==null || age<=0) {
			throw new IllegalArgumentException("set correct values to name and age");
		}
	}
	
	public String check() {
		if(age>18) {
			return "MR./MRS./MISS "+name+" , you are eligible to vote -> verified on : "+verifiedOn+"";
		}
		else {
			return "MR./MRS./MISS "+name+" , you are not eligible to vote -> verified on : "+verifiedOn+"";
		}
	}
	
	@PreDestroy
	public void myDestroy(){
		name=null;
		age=0;
		id=null;
		verifiedOn=null;
		
	}
}
