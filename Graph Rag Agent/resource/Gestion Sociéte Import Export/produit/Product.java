package com.importexport.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String originCountry;

    public Product(int id, String name, double price, int quantity, String originCountry) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.originCountry = originCountry;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }
}