package com.sri.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"test"})
public class SMSNotification implements NotificationService {

	@Override
	public String send(Notification n) {
		return "sms to "+n.getReceipient()+" with id "+n.getId()+" :"+n.getMessage();
	}

}
