package RPG;

/**
 * Created by admin on 02.09.2017.
 */
public class RefleksLeniwca extends MieczDekorator {

    Miecz _miecz;

    public RefleksLeniwca(Miecz miecz){this._miecz = miecz;}

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " refleks Leniwca";}

    @Override
    public double atak() {return _miecz.atak() + 77; }


}
