package com.bazinga.model;


import java.util.ArrayList;

public class Product {

    private Integer id;
    private String title;
    private String description;
    private ArrayList<String> availableSizes;
    private Integer price;
    private String isFreeShipping;
    private String imageId;

    public Product() {
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    public Product(Integer id, String title, String description, ArrayList<String> availableSizes, Integer price, String isFreeShipping, String imageId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.availableSizes = availableSizes;
        this.price = price;
        this.isFreeShipping = isFreeShipping;
        this.imageId = imageId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(ArrayList<String> availableSizes) {
        this.availableSizes = availableSizes;
    }


    public String getIsFreeShipping() {
        return isFreeShipping;
    }

    public void setIsFreeShipping(String isFreeShipping) {
        this.isFreeShipping = isFreeShipping;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
