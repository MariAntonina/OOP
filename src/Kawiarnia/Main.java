package Kawiarnia;

/**
 * Created by admin on 30.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        MocnoPalona mp = new MocnoPalona();
        Czekolada cz = new Czekolada(mp);
        System.out.printf("Nazwa: %s :: Cena %.2f",
                cz.pobierzOpis(), cz.koszt());

        System.out.println();
        Espresso ess = new Espresso();
        BitaSmietana bt = new BitaSmietana(ess);
        MleczkoSojowe ms = new MleczkoSojowe(bt);

        System.out.printf(" Nazwa: %s :: Cena %.2f", ms.pobierzOpis(), ms.koszt());
    }
}
