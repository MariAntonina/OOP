package SymylatorKaczek;

/**
 * Created by admin on 28.08.2017.
 */
public class KaczkaWabik extends Kaczka{

    public KaczkaWabik(){

        latanie = new NieLatam();
        kwakanie = new NieKwacz();
    }

    public void print() {
        System.out.println("Kaczopodobny wabik");
    }

}
