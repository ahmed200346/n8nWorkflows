package Classes;
public abstract class VehiculeMotorise implements Vehicule {
    protected String marque;
    protected String modele;
    protected int puissance;

    public VehiculeMotorise(String marque, String modele, int puissance) {
        this.marque = marque;
        this.modele = modele;
        this.puissance = puissance;
    }

    @Override
    public void demarrer() {
        System.out.println(getType() + " " + marque + " " + modele + " démarre.");
    }

    @Override
    public void arreter() {
        System.out.println(getType() + " " + marque + " " + modele + " s'arrête.");
    }

    @Override
    public abstract String getType();
}
