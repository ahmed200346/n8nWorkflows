package Classes;

public class Voiture extends VehiculeMotorise {
    private int nombrePortes;

    public Voiture(String marque, String modele, int puissance, int nombrePortes) {
        super(marque, modele, puissance);
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    @Override
    public String getType() {
        return "Voiture";
    }
}
