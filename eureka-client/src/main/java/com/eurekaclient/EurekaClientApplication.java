package com.eurekaclient;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eurekaclient.repo.ProductRepo;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
public class EurekaClientApplication  {

	@Autowired
	private FeignClient feignClient;
	
	@Autowired
    private ProductRepo productRepo;

	
	@RequestMapping("/")
	public String home() throws JSONException{
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("message", "Hello Eureka Client");
		System.out.println("ddd "+feignClient.productClientResponse());
		//productRepo.save(pro)
		jsonObject.put("message-2",feignClient.productClientResponse());
		
		return jsonObject.toString();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}
