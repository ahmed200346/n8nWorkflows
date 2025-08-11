package Classes;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres;
    private List<Utilisateur> utilisateurs;

    public Bibliotheque() {
        livres = new ArrayList<>();
        utilisateurs = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
        System.out.println("Livre ajouté: " + livre.getTitre());
    }

    public void enregistrerUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
        System.out.println("Utilisateur enregistré: " + utilisateur.getNom() + " (" + utilisateur.getType() + ")");
    }

    public void afficherLivresDisponibles() {
        System.out.println("\nLivres disponibles :");
        for (Livre l : livres) {
            if (!l.estEmprunte()) {
                System.out.println("- " + l.getTitre() + " de " + l.getAuteur());
            }
        }
    }
}