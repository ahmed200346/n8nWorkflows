package Classes;

public class Moto extends VehiculeMotorise {
    private boolean aSidecar;

    public Moto(String marque, String modele, int puissance, boolean aSidecar) {
        super(marque, modele, puissance);
        this.aSidecar = aSidecar;
    }

    public boolean isSidecar() {
        return aSidecar;
    }

    @Override
    public String getType() {
        return "Moto";
    }
}
