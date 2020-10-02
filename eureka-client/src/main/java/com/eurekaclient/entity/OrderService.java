package com.eurekaclient.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderService {

	@Id
	 private String serviceId;
	 private String customerName;
	 private String shippingAddress;
	 private Date orderDate;
	 private String orderItem;
	 private int total;
	    
	 public OrderService() {
		 
	 }
	    public OrderService(String serviceId, String customerName, String shippingAddress,Date orderDate,String orderItem,int total) {
	        this.serviceId = serviceId;
	        this.customerName = customerName;
	        this.shippingAddress = shippingAddress;
	        this.orderDate = orderDate;
	        this.orderItem = orderItem;
	        this.total = total;
	    }


		public String getServiceId() {
			return serviceId;
		}


		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public String getShippingAddress() {
			return shippingAddress;
		}


		public void setShippingAddress(String shippingAddress) {
			this.shippingAddress = shippingAddress;
		}


		public Date getOrderDate() {
			return orderDate;
		}


		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}


		public String getOrderItem() {
			return orderItem;
		}


		public void setOrderItem(String orderItem) {
			this.orderItem = orderItem;
		}


		public int getTotal() {
			return total;
		}


		public void setTotal(int total) {
			this.total = total;
		}

	    
}
