package Taxes;

/**
 * Created by admin on 30.08.2017.
 */
public class ZlotaCizemka implements IProduct {

    private String _name;
    private double _price;

    public ZlotaCizemka() {
        this._name ="Zlota ciżemka i Turbo Żółw";
        this._price = 59.34;
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double priceNetto() {
        return _price;
    }
}
