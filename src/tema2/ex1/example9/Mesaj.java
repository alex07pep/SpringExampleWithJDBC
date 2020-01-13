package tema2.ex1.example9;

public class Mesaj
{
    private	String mesaj;
    public String getMesaj()
    {
        return mesaj;
    }
    public void setMesaj(String mesaj)
    {
        this.mesaj= mesaj;
    }
    @Override public String toString()
    {
        return mesaj;
    }
}
