package com.example.ItemsAPI.repository;

import com.example.ItemsAPI.repository.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>
{
}
