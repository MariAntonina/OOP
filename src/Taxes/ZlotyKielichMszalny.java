package Taxes;

/**
 * Created by admin on 10.09.2017.
 */
public class ZlotyKielichMszalny implements IProduct {
    private String _name;
    private double _price;

    public ZlotyKielichMszalny() {
        this._name ="Zloty kielich";
        this._price = 10034.273;
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
