package RPG;

/**
 * Created by admin on 02.09.2017.
 */
public class StalowaKlataDavidaHasselhoffa extends TarczaDekorator {

    Tarcza _tarcza;

    public StalowaKlataDavidaHasselhoffa(Tarcza tarcza){this._tarcza = tarcza;}

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " stalowa klata Davida Hasselhoffa.";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 13;
    }
}
