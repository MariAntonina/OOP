package RPG;

/**
 * Created by admin on 02.09.2017.
 */
public class KociolGargamela extends PlecakDekorator {
    Plecak _plecak;

    public KociolGargamela(Plecak plecak){this._plecak = plecak;}

    @Override
    public String pobierzOpis() {
        return _plecak.pobierzOpis() + " Wielki kociol Gargamela";
    }

    @Override
    public double pojemnosc() {return _plecak.pojemnosc() + 180;}
}
