package com.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eurekaclient.entity.OrderService;
import com.eurekaclient.entity.Product;
import com.eurekaclient.repo.OrderServiceRepo;
import com.eurekaclient.repo.ProductRepo;

@Controller
public class ProductController {

	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	OrderServiceRepo orderServiceRepo;
	
	@RequestMapping("/addProduct")
	public String addProduct(Product product) {
		
		productRepo.save(product);
		return "product.jsp";
	}
	
	@RequestMapping("/viewProduct")
	public String viewProduct() {
		return "product.jsp";
	}
	

	@RequestMapping("/addService")
	public String addService(OrderService orderService) {
		
		orderServiceRepo.save(orderService);
		return "orderService.jsp";
	}
	
	@RequestMapping("/viewService")
	public String viewService() {
		return "orderService.jsp";
	}
	
}
