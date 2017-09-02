package Kawiarnia;

/**
 * Created by admin on 30.08.2017.
 */
public class Bezkofeinowa extends Napoj {

    public Bezkofeinowa(){
        opis = "Bezkofeinowa";

    }

    @Override
    public double koszt() {
        return  1.05;
    }
}
