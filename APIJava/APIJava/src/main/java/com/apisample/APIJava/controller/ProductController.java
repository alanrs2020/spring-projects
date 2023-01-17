package com.apisample.APIJava.controller;


import com.apisample.APIJava.model.Product;
import com.apisample.APIJava.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {



    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/products")
    public List getAllProduct(){
        return productService.getAllProducts();
    }

    @PostMapping("/addNewProduct")
    public Product addNew(@RequestBody Product product){
        return  productService.addNewProduct(product);
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProduct(@PathVariable("id") long id){
        return productService.getProductById(id);
    }

    @PutMapping("/product/{id}")
    public void UpdateProduct(@PathVariable("id") long id, @RequestBody Product product){
        productService.UpdateProductImage(id, product.getImagesList());
    }

}
