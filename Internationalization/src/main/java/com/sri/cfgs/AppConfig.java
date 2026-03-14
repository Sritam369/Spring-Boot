package com.sri.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {

	@Bean(name="messageSource")
	public ResourceBundleMessageSource create() {
		ResourceBundleMessageSource r = new ResourceBundleMessageSource();
		r.setBasename("com/sri/commons/message");
		return r;
	}
}
