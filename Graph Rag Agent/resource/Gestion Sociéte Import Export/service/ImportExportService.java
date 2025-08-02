package com.importexport.service;

import com.importexport.model.Customer;
import com.importexport.model.Order;
import com.importexport.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ImportExportService {
    private List<Product> products;
    private List<Customer> customers;
    private List<Order> orders;

    public ImportExportService() {
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void createOrder(int orderId, int customerId, int productId, int quantity) {
        Customer customer = customers.stream()
                .filter(c -> c.getId() == customerId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Client non trouvé"));
        
        Product product = products.stream()
                .filter(p -> p.getId() == productId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Produit non trouvé"));

        Order order = new Order(orderId, customer);
        order.addProduct(product, quantity);
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}