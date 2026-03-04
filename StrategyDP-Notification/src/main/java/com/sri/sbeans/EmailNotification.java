package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("smail")
public class EmailNotification implements NotificationStrategy{

	@Override
	public void send(String message) {
		IO.println(message+" sent by email");		
	}

}
