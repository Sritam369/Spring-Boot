package com.sri.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Notification {

	private int id;
	private String message;
	private String receipient;
}
