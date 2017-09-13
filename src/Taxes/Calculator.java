package Taxes;

import java.util.List;

/**
 * Created by admin on 28.08.2017.
 */
public class Calculator {

    private ITax _tax;
    private List<IProduct> _product;

    public Calculator(ITax tax, List<IProduct> product) {
        _tax = tax;
        _product = product;
    }
    public double bruttoPrice(){
        double brutto = 0.0;
        for (IProduct iProduct : _product) {
            brutto += _tax.calulateBrutto(iProduct.priceNetto());
        }
        return brutto;
    }

    public void setTax(ITax tax){
        _tax = tax;
    }

    public void basketOfProducts(){
        for (IProduct iProduct : _product) {
            System.out.printf("%s. Cena netto: %.2f, brutto: %.2f. Kod: %s \n ",
                    iProduct.getName(), iProduct.priceNetto(),
                    _tax.calulateBrutto(iProduct.priceNetto()),
                    _tax.countrySignature(iProduct.getName()));
        }
    }
}
