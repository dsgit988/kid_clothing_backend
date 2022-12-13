package com.ecommerce.kidclothing.repository.entity;

import com.ecommerce.kidclothing.controller.dto.ItemDto;
import jakarta.persistence.*;

@Entity
@Table(name="Item")
public class Item
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="imageUrl")
    private String imageUrl;

    @Column(name="price")
    private Double price;

    public Item() {
    }

    public Item(ItemDto itemDto) {
        this.name = itemDto.getName();
        this.description = itemDto.getDescription();
        this.imageUrl = itemDto.getImageUrl();
        this.price = itemDto.getPrice();
    }

    public Item(String name, String description, String imageUrl, Double price) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", price=" + price +
                '}';
    }
}
