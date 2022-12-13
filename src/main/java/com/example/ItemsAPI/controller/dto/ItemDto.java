package com.example.ItemsAPI.controller.dto;

public class ItemDto {

    private String name;

    private String description;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String imageUrl;
    private int price;

    public ItemDto( String name, String description, String imageUrl ,int price)
    {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price=price;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public void setImageUrl( String imageUrl )
    {
        this.imageUrl = imageUrl;
    }





}
