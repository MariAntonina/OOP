package Interfejsy;

/**
 * Created by admin on 23.08.2017.
 */
public class Motocykl implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.printf("Jade Motocyklem!");
    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuje Motocyklem!");
    }

    @Override
    public void przewrocSie() {
        System.out.printf("Przewracam sie na Motocyklu!");

    }
    public void dodajGazu(){}
}
