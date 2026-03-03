package com.sri.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.sri.sbeans")
@PropertySource("com/sri/commons/Info.properties")
public class AppConfig {

}
