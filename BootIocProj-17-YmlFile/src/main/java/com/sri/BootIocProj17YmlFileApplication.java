package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sri.sbeans.Employee;

@SpringBootApplication
public class BootIocProj17YmlFileApplication {

	public static void main(String[] args) {
		Employee bean = SpringApplication.run(BootIocProj17YmlFileApplication.class, args).getBean("emp",Employee.class);
		IO.println(bean);
	}

}
