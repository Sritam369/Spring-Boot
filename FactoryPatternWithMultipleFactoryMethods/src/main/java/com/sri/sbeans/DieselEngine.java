package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements Engine{

	@Override
	public String getEngineType() {
		return "Diesel engine";
	}

}