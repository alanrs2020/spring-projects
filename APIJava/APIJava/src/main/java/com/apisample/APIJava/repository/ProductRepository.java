package com.apisample.APIJava.repository;

import com.apisample.APIJava.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
