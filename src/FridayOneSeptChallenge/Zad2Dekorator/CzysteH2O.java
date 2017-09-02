package FridayOneSeptChallenge.Zad2Dekorator;

/**
 * Created by admin on 01.09.2017.
 */
public class CzysteH2O extends NalewkaDekorator {

    private Nalewka _naleweczka;

    public CzysteH2O(Nalewka naleweczka){
        _naleweczka = naleweczka;
    }

    @Override
    public String pobierzOpis() {
        return _naleweczka.pobierzOpis() + "H20";
    }

    @Override
    public int robAlkohol() {
        return _naleweczka.robAlkohol() - 8;
    }
}
