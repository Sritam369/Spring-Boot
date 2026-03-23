package com.sri.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev"})
public class EmailNotification implements NotificationService{

	@Override
	public String send(Notification n) {
		return "email to "+n.getReceipient()+" with id "+n.getId()+" :"+n.getMessage();
	}

	
}
