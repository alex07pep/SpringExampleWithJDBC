package tema2.ex2;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicul {
    protected int price;
    protected int viteza_max;

    public int getPrice()
    {
        return price;
    }

    @Autowired(required=false)
    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getViteza_max()
    {
        return viteza_max;
    }
    public void setViteza_max(int viteza_max)
    {
        this.viteza_max=viteza_max;
    }


    public String toString()
    {
        return "Pret: " + price + ", Max speed: "+ viteza_max;
    }
}
