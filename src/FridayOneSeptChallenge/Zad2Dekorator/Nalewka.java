package FridayOneSeptChallenge.Zad2Dekorator;

/**
 * Created by admin on 01.09.2017.
 */
public abstract class Nalewka {

    protected String opis;

    public String pobierzOpis(){
        return opis;
    }
    public abstract int robAlkohol();
}
