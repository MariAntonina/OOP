package RPG;

/**
 * Created by admin on 02.09.2017.
 */
public class KielProsiaczka extends MieczDekorator {

    Miecz _miecz;

    public KielProsiaczka(Miecz miecz){this._miecz = miecz;}

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " kiel Prosiaczka";}

    @Override
    public double atak() {return _miecz.atak() + 13; }
}
