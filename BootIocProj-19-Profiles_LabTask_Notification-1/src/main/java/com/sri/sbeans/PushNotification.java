package com.sri.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"prod"})
public class PushNotification implements NotificationService {

	@Override
	public String send(Notification n) {
		return "push notification to "+n.getReceipient()+" with id "+n.getId()+" :"+n.getMessage();
	}

}
