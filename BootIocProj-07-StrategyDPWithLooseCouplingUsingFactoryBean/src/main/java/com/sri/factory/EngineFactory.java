package com.sri.factory;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sri.sbeans.DieselEngine;
import com.sri.sbeans.ElectricEngine;
import com.sri.sbeans.Engine;
import com.sri.sbeans.PetrolEngine;

@Component("fb")
public class EngineFactory implements FactoryBean<Engine> {
	
	@Value("${engine.id}")
	private String engId;

	@Override
	public Engine getObject() throws Exception {
		if(engId.equalsIgnoreCase("petrol")) {
			return new PetrolEngine();
		}
		else if(engId.equalsIgnoreCase("diesel")) {
			return new DieselEngine();
		}
		else  {
			return new ElectricEngine();
		}
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		return Engine.class;
	}

}
