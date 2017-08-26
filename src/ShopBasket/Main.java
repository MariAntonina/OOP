package ShopBasket;

import java.util.ArrayList;

/**
 * Created by admin on 23.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<IProduct> basket = new ArrayList<>();
        basket.add(new HarryPotter());
        basket.add(new LordOfTheRing());
        basket.add(new GunsNRoses());
        basket.add(new NocnyKochanek());

        int sum = 0;
        for (IProduct Product : basket) {
            sum = sum + Product.getPrice();}
        System.out.printf("The cost of your basket is: %d dolars", sum);

    }
}
