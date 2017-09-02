package Kawiarnia;

/**
 * Created by admin on 30.08.2017.
 */
public abstract class Napoj {

    protected String opis;

    public String pobierzOpis(){
        return  opis;};
    public abstract double koszt();
}
