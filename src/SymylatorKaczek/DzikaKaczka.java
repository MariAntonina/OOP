package SymylatorKaczek;

/**
 * Created by admin on 28.08.2017.
 */
public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(){
        latanie = new latamBoMamSkrzydla();
        kwakanie = new Kwacz();
    }

    @Override
    public void print() {

    }
}
