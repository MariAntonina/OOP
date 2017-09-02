package Adapter;

/**
 * Created by admin on 31.08.2017.
 */
public class DzikiIndyk implements IIndyk {
    @Override
    public void gulgocze() {
        System.out.println("Gul gul gul!");
    }

    @Override
    public void lataj() {
        System.out.println("Indyk fru fru fru!");
    }
}
