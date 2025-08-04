# Animal.java Documentation

## Description
La classe `Animal` représente une entité de base pour tous les animaux dans le système de gestion de zoo. Elle définit les attributs communs à tous les animaux, tels que leur famille, nom, âge et statut de mammifère.

## Package
`tn.esprit.gestionzoo.entities`

## Attributs
- `family` : La famille de l'animal (String)
- `name` : Le nom de l'animal (String)
- `age` : L'âge de l'animal (int)
- `isMammal` : Indique si l'animal est un mammifère (boolean)

## Constructeurs
```java
public Animal()
```
Constructeur par défaut.

```java
public Animal(String family, String name, int age, boolean isMammal)
```
Initialise un animal avec les attributs fournis. Vérifie que l'âge n'est pas négatif.

## Méthodes
- `displayAnimal()` : Affiche les informations de l'animal (famille, nom, âge, statut de mammifère).
- `getFamily()` : Retourne la famille de l'animal.
- `getName()` : Retourne le nom de l'animal.
- `getAge()` : Retourne l'âge de l'animal.
- `isMammal()` : Retourne le statut de mammifère.
- `setAge(int age)` : Modifie l'âge de l'animal, avec validation pour éviter les valeurs négatives.
- `toString()` : Retourne une représentation textuelle de l'animal.

## Emplacement
Cette classe est située dans le package `tn.esprit.gestionzoo.entities` et sert de classe de base pour toutes les sous-classes d'animaux (par exemple, `Aquatic`, `Terrestrial`).