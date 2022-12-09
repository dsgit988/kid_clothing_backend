package com.ecommerce.kidclothing.controller;

import com.ecommerce.kidclothing.repository.ProductRepository;
import com.ecommerce.kidclothing.repository.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ProductController {
    final ProductRepository productRepository;


    public ProductController(@Autowired ProductRepository productRepository )
    {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Iterable<Product> getProducts(){
        return productRepository.findAll();
    }
}
