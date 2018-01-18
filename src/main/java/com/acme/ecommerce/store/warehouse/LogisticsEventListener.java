package com.acme.ecommerce.store.warehouse;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
class LogisticsEventListener {

	private PackageMessage packageMessage;

	@StreamListener(LogisticsQueue.LOGISTICS_QUEUE_NAME)
	void handle(PackageMessage packageMessage) {
		this.packageMessage = packageMessage;
	}

	public PackageMessage getPackageMessage() {
		return packageMessage;
	}
}
