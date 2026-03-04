package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotification implements NotificationStrategy{

	@Override
	public void send(String message) {
		IO.println(message+" sent by SMS");		
	}

}
