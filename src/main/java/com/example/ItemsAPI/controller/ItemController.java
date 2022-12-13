package com.example.ItemsAPI.controller;

import com.example.ItemsAPI.controller.dto.ItemDto;
import com.example.ItemsAPI.repository.Entity.Item;
import com.example.ItemsAPI.repository.ItemRepository;
import com.example.ItemsAPI.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {


    @Autowired
    ItemService itemService;


    final ItemRepository itemRepository;


    public ItemController(@Autowired ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public Iterable<Item> getItems() {
        //return itemRepository.findAll();
        return itemService.all();
    }


    @PostMapping
    public Item save( @RequestBody ItemDto itemDto )
    {
        return itemService.save( new Item( itemDto ) );
    }



    @PutMapping( "/{id}" )
    public  Item update( @RequestBody ItemDto itemDto, @PathVariable Integer id )
    {
        Optional<Item> item = itemService.findById( id );
         if(item.isPresent()) {
             item.get().setName(itemDto.getName());
             item.get().setDescription(itemDto.getDescription());
             item.get().setImageUrl(itemDto.getImageUrl());
             return itemService.save(item.get());
         }
         return null;
    }








    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemService.delete( id );
    }

    @GetMapping("/{id}")
    public Optional<Item> findItemById(@PathVariable Integer id ){
        return itemService.findById( id );
    }





}