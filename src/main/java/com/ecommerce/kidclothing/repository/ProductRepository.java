package com.ecommerce.kidclothing.repository;

import com.ecommerce.kidclothing.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{
}