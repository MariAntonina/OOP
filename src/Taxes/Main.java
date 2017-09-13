package Taxes;

import java.util.ArrayList;

/**
 * Created by admin on 28.08.2017.
 */
public class Main {

    public static void main(String[] args) {

        ITax taxPL = new PolishTaxes();
        ITax taxUSA = new USATaxes();

        ArrayList<IProduct> products = new ArrayList<>();
        products.add(new ZlotaCizemka());
        products.add(new ZlotyKielichMszalny());

        Calculator calculator = new Calculator(taxUSA, products);
        calculator.basketOfProducts();

        calculator.setTax(taxPL);
        calculator.basketOfProducts();
    }
}
