package Adapter;

/**
 * Created by admin on 31.08.2017.
 */
public class KaczkaAdapter implements IIndyk {
    private IKaczka _kaczka;

    public KaczkaAdapter(IKaczka kaczka){
        _kaczka = kaczka;
    }

    @Override
    public void gulgocze() {
        _kaczka.kwacz();

    }

    @Override
    public void lataj() {
        _kaczka.lataj();
    }
}
