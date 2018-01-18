package com.acme.ecommerce.store.warehouse;

import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = "com.acme.ecommerce:warehouse:+:stubs")
abstract class AbstractWarehouseContractTest {

}
