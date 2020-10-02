package com.orderservice.entity;

import java.util.Date;

public class OrderService {

	private String serviceId;
	 private String custumerName;
	 private String shippingAddress;
	 private Date orderDate;
	 private String orderItem;
	 private int total;
	    

	    public OrderService(String serviceId, String custumerName, String shippingAddress,Date orderDate,String orderItem,int total) {
	        this.serviceId = serviceId;
	        this.custumerName = custumerName;
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


		public String getCustumerName() {
			return custumerName;
		}


		public void setCustumerName(String custumerName) {
			this.custumerName = custumerName;
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
