package com.sri.sbeans;

import org.springframework.stereotype.Component;

@Component("wp")
public class WhatsAppNotification implements NotificationStrategy{

	@Override
	public void send(String message) {
		IO.println(message+" sent by wp");		
	}

}
