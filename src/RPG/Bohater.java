package RPG;

/**
 * Created by admin on 30.08.2017.
 */
public class Bohater {

    private String _imie;
    private Tarcza _tarcza;
    private Miecz _miecz;
    private Plecak _plecak;

    public Bohater(String imie, Tarcza tarcza, Miecz miecz, Plecak plecak ) {
        _imie = imie;
        _tarcza = tarcza;
        _miecz = miecz;
        _plecak = plecak;
    }

    public String toString() {
     return  String.format("Bohater [ %s, Ubrany jest w %s, %.0f,\n%s, %.0f, \n%s, %.0f]",
                _imie, _tarcza.pobierzOpis(), _tarcza.obrona(),
                _miecz.pobierzOpis(), _miecz.atak(),
                _plecak.pobierzOpis(), _plecak.pojemnosc());}
}

