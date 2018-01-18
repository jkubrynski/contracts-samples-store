package com.acme.ecommerce.store;

import com.acme.ecommerce.store.warehouse.LogisticsQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableFeignClients
@EnableBinding(LogisticsQueue.class)
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}
}
