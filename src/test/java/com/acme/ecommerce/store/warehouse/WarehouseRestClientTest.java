package com.acme.ecommerce.store.warehouse;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class WarehouseRestClientTest extends AbstractWarehouseContractTest {

	@Autowired
	WarehouseRestClient warehouseRestClient;

	@Test
	public void shouldReturnProductAvailability() {
		// when
		ProductStock productStock = warehouseRestClient.checkStock(34257815);

		//then
		assertThat(productStock.getId()).isEqualTo(34257815);
		assertThat(productStock.isAvailable()).isTrue();

	}

}
