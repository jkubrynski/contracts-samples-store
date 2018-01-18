package com.acme.ecommerce.store.warehouse;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("warehouse")
public interface WarehouseRestClient {

	@GetMapping(value = "/stocks/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	ProductStock checkStock(@PathVariable("productId") int productId);
}
