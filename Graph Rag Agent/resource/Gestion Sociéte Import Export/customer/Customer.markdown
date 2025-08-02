# Customer.java Documentation

## Description
La classe `Customer` représente un client dans le système de gestion d'une société d'import-export. Elle stocke les informations de base sur un client, telles que son identifiant, son nom, son email et son pays.

## Package
`com.importexport.model`

## Attributs
- `id` : Identifiant unique du client (int)
- `name` : Nom du client (String)
- `email` : Adresse email du client (String)
- `country` : Pays du client (String)

## Constructeur
```java
public Customer(int id, String name, String email, String country)
```
Initialise un nouveau client avec les informations fournies.

## Méthodes
- `getId()` : Retourne l'identifiant du client.
- `getName()` : Retourne le nom du client.
- `getEmail()` : Retourne l'email du client.
- `getCountry()` : Retourne le pays du client.
- `toString()` : Retourne une représentation textuelle du client.

## Emplacement
Cette classe est située dans le package `com.importexport.model` et est utilisée pour représenter les clients dans le système.