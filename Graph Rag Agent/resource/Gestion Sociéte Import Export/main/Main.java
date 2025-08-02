package com.importexport.main;

import com.importexport.model.Customer;
import com.importexport.model.Product;
import com.importexport.service.ImportExportService;

public class Main {
    public static void main(String[] args) {
        ImportExportService service = new ImportExportService();

        // Ajout de produits
        Product p1 = new Product(1, "Télévision", 500.0, 10, "Chine");
        Product p2 = new Product(2, "Ordinateur", 1000.0, 5, "Japon");
        service.addProduct(p1);
        service.addProduct(p2);

        // Ajout de clients
        Customer c1 = new Customer(1, "Jean Dupont", "jean.dupont@example.com", "France");
        Customer c2 = new Customer(2, "Marie Smith", "marie.smith@example.com", "USA");
        service.addCustomer(c1);
        service.addCustomer(c2);

        // Création de commandes
        service.createOrder(1, 1, 1, 2); // Jean achète 2 télévisions
        service.createOrder(2, 2, 2, 1); // Marie achète 1 ordinateur

        // Affichage des commandes
        for (var order : service.getOrders()) {
            System.out.println(order);
        }
    }
}