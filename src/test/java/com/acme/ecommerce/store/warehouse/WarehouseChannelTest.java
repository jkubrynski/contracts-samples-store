package com.acme.ecommerce.store.warehouse;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.contract.stubrunner.StubFinder;
import org.springframework.messaging.Message;

import static org.assertj.core.api.Assertions.assertThat;

public class WarehouseChannelTest extends AbstractWarehouseContractTest {

	@Autowired
	StubFinder stubFinder;

	@Autowired
	LogisticsQueue logisticsQueue;

	Message<PackageMessage> receivedMessage;

	@Test
	public void shouldReturnProductAvailability() {
		// given
		logisticsQueue.logisticsQueueSubscription().subscribe(message -> this.receivedMessage = (Message<PackageMessage>) message);

		// when
		stubFinder.trigger("packageSentMessage");

		// then
		assertThat(receivedMessage.getPayload().getEventType()).isEqualTo(LogisticsEventType.PACKAGE_SENT);
		assertThat(receivedMessage.getPayload().getObjectId()).isEqualTo("7JS8HD8");

	}

}
