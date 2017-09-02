package FridayOneSeptChallenge.Zad2Dekorator;

/**
 * Created by admin on 01.09.2017.
 */
public class Main {

    public static void main(String[] args) {


        czystySpirytus cs = new czystySpirytus();
        CzysteH2O h2O = new CzysteH2O(cs);
        SokMalinowy sm = new SokMalinowy(h2O);
        SokArganowy sa = new SokArganowy(sm);

        System.out.printf("Nazwa: %s :: Zawartosc alkoholu %d%%.",
                sa.pobierzOpis(), sa.robAlkohol());

    }
}
