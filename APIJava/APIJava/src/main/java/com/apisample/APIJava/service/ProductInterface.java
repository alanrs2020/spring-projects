package com.apisample.APIJava.service;

import com.apisample.APIJava.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductInterface {
    Optional<Product> getProductById(Long Id);
    List<Product> getAllProducts();

    Product addNewProduct(Product product);
    //Product UpdateProductById(long id,Product product);

    void UpdateProductImage(long id, String imageList);
}
