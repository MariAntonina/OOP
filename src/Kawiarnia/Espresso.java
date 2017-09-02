package Kawiarnia;

/**
 * Created by admin on 30.08.2017.
 */
public class Espresso extends Napoj {

    public Espresso() {
        opis ="Espresso";
    }

    @Override
    public double koszt() {
        return 1.99;
    }
}
