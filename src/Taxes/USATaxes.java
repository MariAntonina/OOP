package Taxes;

/**
 * Created by admin on 28.08.2017.
 */
public class USATaxes implements ITax {
    @Override
    public double calulateBrutto(double price) {
        return price*(1 + 0.15);
    }

    @Override
    public String countrySignature(String sign) {
        return "USA";
    }
}
