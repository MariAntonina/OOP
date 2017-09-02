package SymylatorKaczek;

/**
 * Created by admin on 28.08.2017.
 */
public class GumowaKaczka extends Kaczka {

    public GumowaKaczka(){
        latanie = new NieLatam();
        kwakanie = new Piszcz();

    }

    public void print(){
        System.out.println("Jestem Gumowa Kaczuszka!");
    }
}

