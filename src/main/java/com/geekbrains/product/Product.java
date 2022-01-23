package com.geekbrains.product;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String seller;
    private String soldAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSeller() { return seller; }

    public void setSeller(String seller) { this.seller = seller; }

    public String getSoldAt() { return soldAt; }

    public void setSoldAt(String soldAt) { this.soldAt = soldAt; }
}
