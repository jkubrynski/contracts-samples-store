package com.acme.ecommerce.store.warehouse;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface LogisticsQueue {

	String LOGISTICS_QUEUE_NAME = "logisticsQueue";

	@Input(LOGISTICS_QUEUE_NAME)
	SubscribableChannel logisticsQueueSubscription();

}
