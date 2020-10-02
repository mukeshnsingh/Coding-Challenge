package com.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(value="ProductClient",url="http://localhost:8002/")
public interface FeignClient {

	@GetMapping
	String productClientResponse();
}
