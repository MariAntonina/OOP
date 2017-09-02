package RPG;

/**
 * Created by admin on 30.08.2017.
 */
public  abstract class Plecak{

    protected String _opis;

    public String pobierzOpis(){
        return _opis;
    }

    public abstract double pojemnosc();
}
