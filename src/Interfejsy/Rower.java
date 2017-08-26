package Interfejsy;

/**
 * Created by admin on 23.08.2017.
 */
public class Rower implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.printf("Jade Rowerem!");

    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuj Rowerem!");

    }

    @Override
    public void przewrocSie() {
        System.out.printf("Wywracam sie!");
    }
}
