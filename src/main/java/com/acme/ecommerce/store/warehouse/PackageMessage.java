package com.acme.ecommerce.store.warehouse;

public class PackageMessage {

	private LogisticsEventType eventType;
	private String objectId;

	public void setEventType(LogisticsEventType eventType) {
		this.eventType = eventType;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public LogisticsEventType getEventType() {
		return eventType;
	}

	public String getObjectId() {
		return objectId;
	}
}
