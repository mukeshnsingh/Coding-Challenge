package com.eurekaclient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	 private String productName;
	 private String productCode;
	 private int qty;
	    
	 	public Product() {
			
		}
	    public Product(int productId, String productName, String productCode,int qty) {
	        this.productId = productId;
	        this.productName = productName;
	        this.productCode = productCode;
	        this.qty = qty;
	    }


		public int getProductId() {
			return productId;
		}


		public void setProductId(int productId) {
			this.productId = productId;
		}


		public String getProductName() {
			return productName;
		}


		public void setProductName(String productName) {
			this.productName = productName;
		}


		public String getProductCode() {
			return productCode;
		}


		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}


		public int getQty() {
			return qty;
		}


		public void setQty(int qty) {
			this.qty = qty;
		}


}
