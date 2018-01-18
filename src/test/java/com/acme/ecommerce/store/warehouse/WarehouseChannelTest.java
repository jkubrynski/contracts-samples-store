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
	LogisticsEventListener logisticsEventListener;

	@Test
	public void shouldReturnProductAvailability() {
		// when
		stubFinder.trigger("packageSentMessage");

		// then
		PackageMessage receivedMessage = logisticsEventListener.getPackageMessage();
		assertThat(receivedMessage.getEventType()).isEqualTo(LogisticsEventType.PACKAGE_SENT);
		assertThat(receivedMessage.getObjectId()).isEqualTo("7JS8HD8");

	}

}
