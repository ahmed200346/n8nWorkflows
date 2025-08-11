package Classes;

public class Professeur extends Utilisateur {
    private String departement;

    public Professeur(String nom, String departement) {
        super(nom);
        this.departement = departement;
    }

    @Override
    public String getType() {
        return "Professeur (Département: " + departement + ")";
    }
}
