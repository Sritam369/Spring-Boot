package com.sri.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.sri.sbean")
public class AppConfig {

	@Bean(name="ldate")
	@Scope("singleton")
	public LocalDate createDate() {
		return LocalDate.now();
	}
	@Bean(name="ldate2")
	@Scope("singleton")
	public LocalDate createDate2() {
		return LocalDate.now();
	}
}
