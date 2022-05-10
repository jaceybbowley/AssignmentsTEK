package com.perscholas.cafe;

    import java.lang.reflect.Constructor;
    
    public class Product {
        private String productName;
        private double productPrice;
        private String productDescription;
        private int productQuantity;
        private double productTotal;
    
        public Product() {
        }
    
        public Product(String productName, double productPrice, String productDescription) {
            this.productName = productName;
            this.productPrice = productPrice;
            this.productDescription = productDescription;
        }
    
        //Calculate PRODUCT SUBTOTAL
        public double calculateProductTotal() {
          productTotal = productPrice * productQuantity;
          return productTotal;
        }
    
        // Get/Set NAME
        public String getProductName() {
            return productName;
        }
        public void setProductName(String newName) {
            this.productName = newName;
        }
    
        // Get/Set PRICE
        public double getProductPrice() {
            return productPrice;
        }
        public void setProductPrice(double newPrice) {
            this.productPrice = newPrice;
        }
    
        // Get/Set DESCRIPTION
        public String getProductDescription() {
            return productDescription;
        }
        public void setProductDescription(String newDescription) {
            this.productDescription = newDescription;
        }
    
        // Get/Set QUANTITY
        public int getProductQuantity() {
            return productQuantity;
        }
        public void setProductQuantity(int newQuantity) {
            this.productQuantity = newQuantity;
        }
    

 
    }
  

