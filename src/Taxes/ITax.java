package Taxes;

/**
 * Created by admin on 28.08.2017.
 */
public interface ITax {
    double calulateBrutto(double price);
    String countrySignature(String sign);
}
