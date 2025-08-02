package com.importexport.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addProduct(Product product, int quantity) {
        if (product.getQuantity() >= quantity) {
            products.add(product);
            totalAmount += product.getPrice() * quantity;
            product.setQuantity(product.getQuantity() - quantity);
        } else {
            throw new IllegalArgumentException("Quantité insuffisante en stock pour le produit : " + product.getName());
        }
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer.getName() +
                ", totalAmount=" + totalAmount +
                ", products=" + products +
                '}';
    }
}