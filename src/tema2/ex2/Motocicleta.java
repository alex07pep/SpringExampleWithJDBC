package tema2.ex2;

public class Motocicleta extends Vehicul {
    private String tipul;

    public Motocicleta() {
    }

    public Motocicleta(int pret, int viteza_max, String tipul) {
        this.price = pret;
        this.viteza_max = viteza_max;
        this.tipul = tipul;
    }

    public String getTipul() {
        return tipul;
    }

    public void setTipul(String tipul) {
        this.tipul = tipul;
    }

    @Override
    public String toString() {
        return "Pret: " + price + ", Max speed: " + viteza_max + ", Model: " + tipul;
    }
}
