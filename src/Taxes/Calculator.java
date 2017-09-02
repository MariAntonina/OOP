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



//    public void getFullCost(){ _product.priceNetto();}
    public void setTax(ITax tax){
        _tax = tax;
    }
}
