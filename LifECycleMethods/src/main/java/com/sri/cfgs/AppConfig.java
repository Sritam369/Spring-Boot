package com.sri.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("com/sri/commons/Info.properties")
@ComponentScan(basePackages="com.sri.sbeans")
public class AppConfig {

}
