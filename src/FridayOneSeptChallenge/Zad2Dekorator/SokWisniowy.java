package FridayOneSeptChallenge.Zad2Dekorator;

/**
 * Created by admin on 01.09.2017.
 */
public class SokWisniowy extends NalewkaDekorator {
    private Nalewka _naleweczka;

    public SokWisniowy(Nalewka naleweczka){
        _naleweczka = naleweczka;
    }

    @Override
    public String pobierzOpis() {
        return _naleweczka.pobierzOpis() + "Soczek z wisienek";
    }

    @Override
    public int robAlkohol() {
        return  _naleweczka.robAlkohol() - 12;
    }

}
