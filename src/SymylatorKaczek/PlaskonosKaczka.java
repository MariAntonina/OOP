package SymylatorKaczek;

/**
 * Created by admin on 28.08.2017.
 */
public class PlaskonosKaczka extends Kaczka {

    public PlaskonosKaczka(){
        latanie = new latamBoMamSkrzydla();
        kwakanie = new Kwacz();
    }

    @Override
    public void print() {
        System.out.println(" Jestem Kaczka Plaskonosa.");
    }
}
