package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("lr")
@Data
public class LibraryRunner {

	@Autowired
	private Library lib;
}
