package com.orderitem;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="OrderSummery",url="http://localhost:8003/")
public interface FeignOrder {

	@GetMapping
	String getOrderSummery();
}
