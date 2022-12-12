package com.ecommerce.kidclothing.service;

import com.ecommerce.kidclothing.repository.ItemRepository;
import com.ecommerce.kidclothing.repository.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceMySQL implements ItemService{
    private final ItemRepository itemRepository;

    public ItemServiceMySQL(@Autowired ItemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item)
    {
        //TODO implement this method
        return itemRepository.save(item);
    }

    @Override
    public void delete( int itemId )
    {
        //TODO implement this method
        itemRepository.deleteById(itemId);
    }

    @Override
    public List<Item> all()
    {
        //TODO implement this method
        return itemRepository.findAll();
    }

    @Override
    public Item findById(int itemId) {
        //TODO implement this method
        return itemRepository.findById(itemId).get();
    }
}
