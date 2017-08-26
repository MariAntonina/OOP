package Interfejsy;

/**
 * Created by admin on 23.08.2017.
 */
public class Samochod implements ICzteroKolowy {
    @Override
    public void jedz() {
        System.out.printf("Jade!\n");

    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuje!\n");
    }

    @Override
    public void jedzNaCzolowke() {
        System.out.printf("Jade na czolowke!\n");
    }


}
