package com.orderitem;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.orderitem.entity.Product;


@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
public class OrderItemApplication {


	@Autowired
	private FeignOrder feignOrder;

	@RequestMapping("/")
	public String home() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		
		Product product1=new Product(1,"Mango", "Mango", 10);
		Product product2=new Product(2,"Pen", "Pen", 11);
		
		jsonObject.put("message", product1);
		jsonObject.put("message3", product2);
		jsonObject.put("message-3", feignOrder.getOrderSummery());
		
		
		return  jsonObject.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderItemApplication.class, args);
	}

}
