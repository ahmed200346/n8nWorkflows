import Classes.*;
public class Main {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Toyota", "Corolla", 130, 4);
        Moto m1 = new Moto("Yamaha", "R1", 200, false);

        v1.demarrer();
        m1.demarrer();

        v1.arreter();
        m1.arreter();

        System.out.println("Voiture a " + v1.getNombrePortes() + " portes.");
        System.out.println("Moto a un sidecar ? " + (m1.isSidecar() ? "Oui" : "Non"));
    }
}
