# ImportExportService.java Documentation

## Description
La classe `ImportExportService` contient la logique métier pour gérer les produits, les clients et les commandes dans le système de gestion d'une société d'import-export.

## Package
`com.importexport.service`

## Attributs
- `products` : Liste des produits disponibles (List<Product>)
- `customers` : Liste des clients (List<Customer>)
- `orders` : Liste des commandes (List<Order>)

## Constructeur
```java
public ImportExportService()
```
Initialise les listes de produits, clients et commandes.

## Méthodes
- `addProduct(Product product)` : Ajoute un produit à la liste des produits.
- `addCustomer(Customer customer)` : Ajoute un client à la liste des clients.
- `createOrder(int orderId, int customerId, int productId, int quantity)` : Crée une nouvelle commande en associant un client et un produit avec une quantité spécifiée.
- `getOrders()` : Retourne la liste des commandes.
- `getProducts()` : Retourne la liste des produits.
- `getCustomers()` : Retourne la liste des clients.

## Emplacement
Cette classe est située dans le package `com.importexport.service` et gère la logique métier du système.