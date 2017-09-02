package RPG;

/**
 * Created by admin on 02.09.2017.
 */
public class BuforyPameliA extends TarczaDekorator {

    Tarcza _tarcza;

    public BuforyPameliA(Tarcza tarcza){this._tarcza = tarcza;}

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " Bufory Pameli A. ";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 500;
    }

}
