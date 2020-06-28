package com.bazinga.model;

import java.util.ArrayList;

public class Cart {
    private Integer orderId;
    private ArrayList<SelectedItem> selectedItems;
    private Integer finalAmount;

    public Cart() {
    }

    public Cart(Integer orderId, ArrayList<SelectedItem> selectedItems, Integer finalAmount) {
        this.orderId = orderId;
        this.selectedItems = selectedItems;
        this.finalAmount = finalAmount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public ArrayList<SelectedItem> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(ArrayList<SelectedItem> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public Integer getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Integer finalAmount) {
        this.finalAmount = finalAmount;
    }
}
