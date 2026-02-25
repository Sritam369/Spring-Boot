package com.sri.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sri.sbean.Printer;

@Configuration
//@ComponentScan(basePackages="com.sri.sbean")
public class AppConfig {

	@Bean(name="p1")
	@Scope("prototype")
	public Printer getPrinter() {
		return Printer.getInstance();
	}
}
