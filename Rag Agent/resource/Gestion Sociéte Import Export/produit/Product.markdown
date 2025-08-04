# Product.java Documentation

## Description
La classe `Product` représente un produit dans le système de gestion d'une société d'import-export. Elle contient les informations de base sur un produit, telles que son identifiant, son nom, son prix, sa quantité en stock et son pays d'origine.

## Package
`com.importexport.model`

## Attributs
- `id` : Identifiant unique du produit (int)
- `name` : Nom du produit (String)
- `price` : Prix unitaire du produit (double)
- `quantity` : Quantité en stock (int)
- `originCountry` : Pays d'origine du produit (String)

## Constructeur
```java
public Product(int id, String name, double price, int quantity, String originCountry)
```
Initialise un nouveau produit avec les informations fournies.

## Méthodes
- `getId()` : Retourne l'identifiant du produit.
- `getName()` : Retourne le nom du produit.
- `getPrice()` : Retourne le prix unitaire.
- `getQuantity()` : Retourne la quantité en stock.
- `setQuantity(int quantity)` : Modifie la quantité en stock.
- `getOriginCountry()` : Retourne le pays d'origine.
- `toString()` : Retourne une représentation textuelle du produit.

## Emplacement
Cette classe est située dans le package `com.importexport.model` et est utilisée comme entité de base pour représenter les produits dans le système.