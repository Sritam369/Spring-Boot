package com.sri.sbeans;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("lb")
@Data
@ConfigurationProperties(prefix="lib.sri")
public class Library {

	private Map<String,String>books;
}
