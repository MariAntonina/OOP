package RPG;

/**
 * Created by admin on 02.09.2017.
 */
public class PosladyGoryla extends PlecakDekorator {

    Plecak _plecak;

    public PosladyGoryla(Plecak plecak){this._plecak = plecak;}

    @Override
    public String pobierzOpis() {
        return _plecak.pobierzOpis() + " Poslady Goryla z Tasmanii";
    }

    @Override
    public double pojemnosc() {
        return _plecak.pojemnosc() + 300;
    }
}
