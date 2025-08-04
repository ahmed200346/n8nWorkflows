package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int NBR_CAGES_MAX = 25;
    private Animal[] animals ;
    private String name;
    private String city;

    private int animalCount = 0;
    //constructeur
    public Zoo(String name, String city) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide !");
        }
        this.name = name;
        this.city = city;
        animals = new Animal[NBR_CAGES_MAX];
    }
    public void displayZoo(){
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre d'animaux : " + animalCount);
        System.out.println("Liste des animaux : ");
        for (int i = 0; i < animalCount; i++) {
            animals[i].displayAnimal();
            System.out.println("---------------------");
        }
    }
    public boolean isZooFull() {
        return animalCount >= NBR_CAGES_MAX;
    }

    public boolean addAnimal(Animal animal){
        if (isZooFull()) {
            System.out.println("Le zoo est plein ! Impossible d'ajouter : " + animal.getName());
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo : " + animal.getName());
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println("tn.esprit.gestionzoo.entities.Animal ajouté : " + animal.getName());
        return true;
    }
    public Animal[] getAnimals(){
        return animals;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getNbrCages() {
        return animalCount;
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{name='" + name + "', city='" + city + "', nbrCages=" + animalCount + ", animalCount=" + animalCount + "}";
    }
    public boolean addAnimal2(Animal animal){
        for (int i =0; i < animalCount; i++){
            if (animals[i] == null){
                animals[i] = animal;
                animalCount++;
                return true;
            }
        }
        return false;
 }

 public int searchAnimal(Animal animal){
        for (int i =0; i < animalCount; i++){
            if (animals[i] != null && animals[i].getName().equalsIgnoreCase(animal.getName())){
                return i;
            }

        }
        return -1;
 }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal " + animal.getName() + " n'existe pas dans le zoo.");
            return false;
        }

        // Décalage des éléments restants pour combler l'espace
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;  // Supprime la dernière référence
        animalCount--;

        System.out.println(" tn.esprit.gestionzoo.entities.Animal supprimé : " + animal.getName());
        return true;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            return null; // Les deux zoos ont le même nombre d'animaux
        }
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide !");
        }
        this.name = name;
    }



}