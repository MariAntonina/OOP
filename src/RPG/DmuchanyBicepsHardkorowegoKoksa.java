package RPG;

/**
 * Created by admin on 02.09.2017.
 */
public class DmuchanyBicepsHardkorowegoKoksa extends PlecakDekorator {
    Plecak _plecak;

    public DmuchanyBicepsHardkorowegoKoksa(Plecak plecak){this._plecak = plecak;}

    @Override
    public String pobierzOpis() {return _plecak.pobierzOpis() + " Dmuchany biceps Hardkorowego Koksa";}

    @Override
    public double pojemnosc() {return _plecak.pojemnosc() + 50;}
}
