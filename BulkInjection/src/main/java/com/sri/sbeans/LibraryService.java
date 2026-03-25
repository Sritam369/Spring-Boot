package com.sri.sbeans;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="library")
public class LibraryService {

	public String name;
	public List<String>books;
	
}
