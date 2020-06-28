package com.bazinga.model;

public class SelectedItem {

    private Integer productId;
    private Integer quantity;
    private String title;
    private Integer price;

    public SelectedItem() {
    }

    public SelectedItem(Integer productId, Integer quantity, String title, Integer price) {
        this.productId = productId;
        this.quantity = quantity;
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
