package com.orderitem.entity;

public class Product {

	 private int productId;
	 private String productName;
	 private String productCode;
	 private int qty;
	    

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
