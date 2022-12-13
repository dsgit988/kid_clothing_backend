package com.example.ItemsAPI.service;

import com.example.ItemsAPI.repository.Entity.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService
{

    Item save(Item item );

    boolean delete( int itemId );

    List<Item> all();

    Optional<Item> findById(int itemId );

}
