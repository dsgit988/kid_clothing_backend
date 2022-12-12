package com.ecommerce.kidclothing.service;

import com.ecommerce.kidclothing.repository.entity.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    Item save(Item item );

    void delete( int itemId );

    List<Item> all();

    Item findById(int itemId );
}
