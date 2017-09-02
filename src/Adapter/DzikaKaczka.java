package Adapter;

/**
 * Created by admin on 31.08.2017.
 */
public class DzikaKaczka implements IKaczka {
    @Override
    public void kwacz() {
        System.out.println("Kwa kwa kwa!");
    }

    @Override
    public void lataj() {
        System.out.println("Fru fru fru!");

    }
}
