package Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Utilisateur {
    protected String nom;
    protected List<Livre> livresEmpruntes;

    public Utilisateur(String nom) {
        this.nom = nom;
        this.livresEmpruntes = new ArrayList<>();
    }

    public void emprunterLivre(Livre livre) {
        if (!livre.estEmprunte()) {
            livre.emprunter();
            livresEmpruntes.add(livre);
        } else {
            System.out.println("Le livre est déjà emprunté.");
        }
    }

    public void retournerLivre(Livre livre) {
        if (livresEmpruntes.contains(livre)) {
            livre.retourner();
            livresEmpruntes.remove(livre);
        } else {
            System.out.println("Ce livre n'a pas été emprunté par cet utilisateur.");
        }
    }

    public abstract String getType();
    public String getNom() {
        return nom;
    }

    public List<Livre> getLivresEmpruntes() {
        return livresEmpruntes;
    }
}