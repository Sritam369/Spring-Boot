package com.sri.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration

public class AppConfig {

	@Bean(name="messageSource")
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource r = new ResourceBundleMessageSource();
		r.setBasename("com/sri/commons/App");
		return r;
	}
}
