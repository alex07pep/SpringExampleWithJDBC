package tema2.ex2;

import org.springframework.beans.factory.annotation.Required;

public class Tir extends Vehicul {
    private int incarcatura_max;

    public Tir(){}
    public Tir(int pret, int viteza_max, int incarcatura_max)
    {
        this.price =pret;
        this.viteza_max=viteza_max;
        this.incarcatura_max=incarcatura_max;
    }

    public int getIncarcatura_max()
    {
        return incarcatura_max;
    }

    @Required
    public void setIncarcatura_max(int incarcatura_max)
    {
        this.incarcatura_max=incarcatura_max;
    }
    @Override
    public String toString()
    {
        return "Pret: " + price + ", Max speed: " + viteza_max+ ", Max Load:"+ incarcatura_max;
    }
}