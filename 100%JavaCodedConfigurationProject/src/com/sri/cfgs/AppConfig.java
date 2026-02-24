package com.sri.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="com.sri.sbean")
public class AppConfig {
  public AppConfig() {
	  
  }
  
  @Bean(name="ldate")
  public LocalDate createDate() {
	  return LocalDate.now();
  }
}
