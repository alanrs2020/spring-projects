package com.apisample.APIJava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private long orderId;
    private String userId;
    private String productId;



}
