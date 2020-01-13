package tema2.ex2;

public class Autoturism extends Vehicul{
    private String marca;
    private int anul;

    public Autoturism(){}
    public Autoturism(int pret, int viteza_max, String marca, int anul)
    {
        this.price =pret;
        this.marca=marca;
        this.anul=anul;
    }
    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca=marca;
    }

    public int getAnul()
    {
        return anul;
    }

    public void setAnul(int anul)
    {
        this.anul=anul;
    }

    @Override
    public String toString()
    {
        return "Pret: " + price + ", Max speed: " + viteza_max + ", Model: "+ marca + ", Made in: "+ anul;
    }
}
