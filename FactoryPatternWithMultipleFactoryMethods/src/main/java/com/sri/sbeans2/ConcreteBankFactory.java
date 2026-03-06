package com.sri.sbeans2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cb")
public class ConcreteBankFactory implements BankFactory{
	
	@Autowired
	private Map<String,Bank>map;
	
    public Bank createBank(String type) {
    	Bank b = map.get(type);
    	return b;
    }
}
