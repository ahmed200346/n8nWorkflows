

import Classes.*;

public class Main {
    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque();

        Livre livre1 = new Livre("1984", "George Orwell");
        Livre livre2 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
        Livre livre3 = new Livre("L'Étranger", "Albert Camus");

        biblio.ajouterLivre(livre1);
        biblio.ajouterLivre(livre2);
        biblio.ajouterLivre(livre3);

        Etudiant etu = new Etudiant("Ahmed", "L3 Info");
        Professeur prof = new Professeur("Mme Ben Salah", "Littérature");

        biblio.enregistrerUtilisateur(etu);
        biblio.enregistrerUtilisateur(prof);

        etu.emprunterLivre(livre1);
        prof.emprunterLivre(livre1); // déjà pris
        prof.emprunterLivre(livre2);

        biblio.afficherLivresDisponibles();

        etu.retournerLivre(livre1);
        prof.emprunterLivre(livre1); // maintenant disponible

        biblio.afficherLivresDisponibles();
    }
}
