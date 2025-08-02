# Order.java Documentation

## Description
La classe `Order` représente une commande passée par un client dans le système de gestion d'une société d'import-export. Elle associe un client à une liste de produits et calcule le montant total de la commande.

## Package
`com.importexport.model`

## Attributs
- `id` : Identifiant unique de la commande (int)
- `customer` : Client associé à la commande (Customer)
- `products` : Liste des produits dans la commande (List<Product>)
- `totalAmount` : Montant total de la commande (double)

## Constructeur
```java
public Order(int id, Customer customer)
```
Initialise une nouvelle commande avec un identifiant et un client.

## Méthodes
- `addProduct(Product product, int quantity)` : Ajoute un produit à la commande avec une quantité spécifiée, met à jour le stock et le montant total.
- `getId()` : Retourne l'identifiant de la commande.
- `getCustomer()` : Retourne le client associé.
- `getProducts()` : Retourne la liste des produits.
- `getTotalAmount()` : Retourne le montant total.
- `toString()` : Retourne une représentation textuelle de la commande.

## Emplacement
Cette classe est située dans le package `com.importexport.model` et est utilisée pour gérer les commandes dans le système.