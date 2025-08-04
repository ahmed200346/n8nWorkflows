# Main.java Documentation

## Description
La classe `Main` est le point d'entrée du programme. Elle démontre l'utilisation du système de gestion d'une société d'import-export en créant des produits, des clients et des commandes.

## Package
`com.importexport.main`

## Méthodes
- `main(String[] args)` : Point d'entrée du programme, crée une instance de `ImportExportService`, ajoute des produits et des clients, crée des commandes et affiche les résultats.

## Emplacement
Cette classe est située dans le package `com.importexport.main` et sert de point d'entrée pour tester le système.

## Exemple d'utilisation
```java
ImportExportService service = new ImportExportService();
Product p1 = new Product(1, "Télévision", 500.0, 10, "Chine");
service.addProduct(p1);
Customer c1 = new Customer(1, "Jean Dupont", "jean.dupont@example.com", "France");
service.addCustomer(c1);
service.createOrder(1, 1, 1, 2);
```