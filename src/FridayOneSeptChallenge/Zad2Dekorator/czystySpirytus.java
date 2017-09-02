package FridayOneSeptChallenge.Zad2Dekorator;

/**
 * Created by admin on 01.09.2017.
 */
public class czystySpirytus extends Nalewka {


    public czystySpirytus(){
        opis = "Czysty Spirytus";
    }

    @Override
    public int robAlkohol() {
        return 90;
    }
}
