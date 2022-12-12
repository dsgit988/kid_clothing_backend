package com.ecommerce.kidclothing.repository;
import com.ecommerce.kidclothing.repository.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>{
}
