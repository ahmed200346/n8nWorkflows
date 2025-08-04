# Aquatic.java Documentation

## Description
La classe `Aquatic` est une sous-classe de `Animal` qui représente les animaux aquatiques dans le système de gestion de zoo. Elle ajoute un attribut spécifique pour l'habitat aquatique.

## Package
`tn.esprit.gestionzoo.entities`

## Attributs
- `habitat` : L'habitat aquatique de l'animal (par exemple, océan, lac) (String)

## Constructeurs
```java
public Aquatic()
```
Constructeur par défaut.

```java
public Aquatic(String habitat)
```
Initialise un animal aquatique avec l'habitat spécifié, appelant le constructeur par défaut de `Animal`.

## Emplacement
Cette classe est située dans le package `tn.esprit.gestionzoo.entities` et sert de classe de base pour les sous-classes d'animaux aquatiques comme `Dolphin` et `Penguin`.