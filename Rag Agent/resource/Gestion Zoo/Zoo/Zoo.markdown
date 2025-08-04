# Zoo.java Documentation

## Description
La classe `Zoo` représente un zoo dans le système de gestion de zoo. Elle gère une collection d'animaux, avec une limite maximale de cages, et fournit des fonctionnalités pour ajouter, supprimer, afficher et comparer des zoos.

## Package
`tn.esprit.gestionzoo.entities`

## Attributs
- `NBR_CAGES_MAX` : Nombre maximum de cages dans le zoo (constante, int, valeur = 25)
- `animals` : Tableau d'animaux dans le zoo (Animal[])
- `name` : Nom du zoo (String)
- `city` : Ville où se trouve le zoo (String)
- `animalCount` : Nombre actuel d'animaux dans le zoo (int)

## Constructeurs
```java
public Zoo(String name, String city)
```
Initialise un zoo avec un nom et une ville. Vérifie que le nom n'est pas vide.

## Méthodes
- `displayZoo()` : Affiche les informations du zoo (nom, ville, nombre d'animaux) et la liste des animaux.
- `isZooFull()` : Vérifie si le zoo a atteint sa capacité maximale.
- `addAnimal(Animal animal)` : Ajoute un animal au zoo si celui-ci n'est pas plein et si l'animal n'existe pas déjà.
- `addAnimal2(Animal animal)` : Version alternative pour ajouter un animal dans un espace vide du tableau.
- `searchAnimal(Animal animal)` : Recherche un animal par son nom et retourne son indice ou -1 s'il n'existe pas.
- `removeAnimal(Animal animal)` : Supprime un animal du zoo s'il existe.
- `getAnimals()` : Retourne le tableau des animaux.
- `getName()` : Retourne le nom du zoo.
- `getCity()` : Retourne la ville du zoo.
- `getNbrCages()` : Retourne le nombre actuel d'animaux.
- `setName(String name)` : Modifie le nom du zoo, avec validation.
- `comparerZoo(Zoo z1, Zoo z2)` : Compare deux zoos et retourne celui avec le plus d'animaux, ou null en cas d'égalité.
- `toString()` : Retourne une représentation textuelle du zoo.

## Emplacement
Cette classe est située dans le package `tn.esprit.gestionzoo.entities` et constitue le cœur du système de gestion de zoo, en gérant les interactions avec les animaux.