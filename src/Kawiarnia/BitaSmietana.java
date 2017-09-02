package Kawiarnia;

/**
 * Created by admin on 30.08.2017.
 */
public class BitaSmietana extends SkladnikiDekorator {

    private Napoj __napoj;

    public BitaSmietana(Napoj napoj){
        __napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return __napoj.pobierzOpis() +" Bita smietana";
    }

    @Override
    public double koszt() {
        return __napoj.koszt() + 0.10;
    }
}
