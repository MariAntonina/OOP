package RPG;

/**
 * Created by admin on 02.09.2017.
 */
public class BrzytwaHerkulesa extends  MieczDekorator {

    Miecz _miecz;

    public BrzytwaHerkulesa(Miecz miecz){this._miecz = miecz;}

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " brzytwa Herkula";}

    @Override
    public double atak() {return _miecz.atak() + 258;}
}
