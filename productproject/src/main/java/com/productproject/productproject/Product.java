package com.productproject.productproject;

public class Product {
    private String productPrice;
    private String productName;
    private String productCategory;

    public Product(String productName, String productCategory, String productPrice) {
        setProductName(productName);
        setProductCategory(productCategory);
        setProductPrice(productPrice);
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductPrice() {
        return productPrice;
    }
    
}
