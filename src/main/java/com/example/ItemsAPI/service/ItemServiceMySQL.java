package com.example.ItemsAPI.service;

import com.example.ItemsAPI.repository.Entity.Item;
import com.example.ItemsAPI.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceMySQL implements ItemService {


    private final ItemRepository itemRepository;

    public ItemServiceMySQL(@Autowired ItemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save( Item item )
    {
        //TODO implement this method

        return itemRepository.save(item);
    }

    @Override
    public boolean delete( int itemId )
    {

        itemRepository.deleteById(itemId);
        return true;
    }

    @Override
    public List<Item> all()
    {
        //TODO implement this method
         return itemRepository.findAll();

    }

    @Override
    public Optional<Item> findById(int itemId )
    {
        return itemRepository.findById(itemId);
    }























}