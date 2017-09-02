package RPG;

/**
 * Created by admin on 02.09.2017.
 */
public class StalowaPrzykrywaStudzienkowa extends TarczaDekorator {
    Tarcza _tarcza;

    public StalowaPrzykrywaStudzienkowa(Tarcza tarcza){this._tarcza = tarcza;}

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " stalowa przykrywa studzienkowa.";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 264;
    }
}
