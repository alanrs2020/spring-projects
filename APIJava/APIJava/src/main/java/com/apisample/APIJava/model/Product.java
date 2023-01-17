package com.apisample.APIJava.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "productName")
    private String productName;
    @Column(name= "brandName")
    private String brandName;
    @Column(name = "category")
    private String category;
    @Column(name = "gender")
    private String gender;
    @Column(name = "size")
    private String size;
    @Column(name = "price")
    private String price;
    @Column(name = "description")
    private String desc;
    @Column(name = "image_urls")
    private String imageList;


    public Product(Long product_id, String productName, String brandName, String category, String gender, String size, String price, String desc, String imageList) {
        this.id = product_id;
        this.productName = productName;
        this.brandName = brandName;
        this.category = category;
        this.gender = gender;
        this.size = size;
        this.price = price;
        this.desc = desc;
        this.imageList = imageList;
    }

    public Product(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImagesList() {
        return imageList;
    }

    public void setImagesList(String imageList) {
        this.imageList = imageList;
    }
}
