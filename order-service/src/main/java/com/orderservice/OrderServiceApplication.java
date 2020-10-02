package com.orderservice;

import java.util.Date;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.entity.OrderService;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class OrderServiceApplication {

	@RequestMapping("/")
	public String home() throws JSONException {
		OrderService orderService=new OrderService("1", "Mukesh","Ghaziyabad", new Date(), "Mango", 10);
		OrderService orderService2=new OrderService("2", "Suresh","Ghaziyabad", new Date(), "Pen", 11);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", orderService);
		jsonObject.put("message", orderService2);
		return jsonObject.toString();
	}
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
