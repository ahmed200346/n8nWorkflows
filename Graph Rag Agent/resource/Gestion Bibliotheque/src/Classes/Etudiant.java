package Classes;

public class Etudiant extends Utilisateur {
    private String niveau;

    public Etudiant(String nom, String niveau) {
        super(nom);
        this.niveau = niveau;
    }

    @Override
    public String getType() {
        return "Étudiant (" + niveau + ")";
    }
}
