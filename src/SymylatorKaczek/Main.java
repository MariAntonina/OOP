package SymylatorKaczek;

/**
 * Created by admin on 28.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        PlaskonosKaczka pk = new PlaskonosKaczka();
        pk.wykonajLatanie();

        DzikaKaczka dk = new DzikaKaczka();
        dk.wykonajLatanie();

        GumowaKaczka gk = new GumowaKaczka();
        gk.wykonaKwakanie();
        gk.wykonajLatanie();
        gk.wyswietl();

        KaczkaWabik kw = new KaczkaWabik();
        kw.wyswietl();
        kw.wykonajLatanie();
        kw.wykonaKwakanie();

        KaczkaModel km = new KaczkaModel();
        km.wyswietl();
        km.wykonajLatanie();
        km.setLatanie(new LotZNapedemRakietowym());
        km.wykonajLatanie();
    }
}
