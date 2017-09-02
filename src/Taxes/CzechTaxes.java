package Taxes;

/**
 * Created by admin on 28.08.2017.
 */
public class CzechTaxes implements ITax {
    @Override
    public double calculate(double price) {
        return price*(1 + 0.1);
    }
}
