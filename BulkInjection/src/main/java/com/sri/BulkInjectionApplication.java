package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sri.sbeans.LibraryService;

@SpringBootApplication
public class BulkInjectionApplication {

	public static void main(String[] args) {
		LibraryService s = SpringApplication.run(BulkInjectionApplication.class, args).getBean(LibraryService.class);
	    IO.println(s);
	}

}
