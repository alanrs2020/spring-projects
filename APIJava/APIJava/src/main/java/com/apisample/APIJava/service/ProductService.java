package com.apisample.APIJava.service;

import com.apisample.APIJava.model.Product;
import com.apisample.APIJava.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductInterface{

    ProductRepository productRepository;
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public Optional<Product> getProductById(Long Id) {
        return productRepository.findById(Id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product addNewProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void UpdateProductImage(long id,String imageList) {
        Optional<Product> product1 = productRepository.findById(id);

        product1.ifPresent(product -> {
            product.setImagesList(imageList);
            productRepository.save(product);

        });

    }


}
