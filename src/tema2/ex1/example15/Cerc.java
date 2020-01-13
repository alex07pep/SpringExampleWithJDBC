package tema2.ex1.example15;

public class Cerc implements Figura {
    private double raza;

    @Override
    public void aria()
    {
        System.out.println("Aria cercului: "+Math.PI*raza*raza);
    }
    public double getRaza()
    {
        return raza;
    }
    public void setRaza(double raza)
    {
        this.raza= raza;
    }
}
