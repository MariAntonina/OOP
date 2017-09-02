package RPG;

/**
 * Created by admin on 30.08.2017.
 */
public abstract class Tarcza extends Bohater  {

    protected String _opis;

    public Tarcza(String imie) {
        super(imie);
    }

    public String pobierzOpis(){
        return _opis;
    }
    public abstract double obrona();
}
