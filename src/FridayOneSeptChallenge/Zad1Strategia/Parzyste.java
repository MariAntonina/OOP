package FridayOneSeptChallenge.Zad1Strategia;

/**
 * Created by admin on 02.09.2017.
 */
public class Parzyste implements IOblicz {

    @Override
    public int[] uruchom(int[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                count++;
            }
        }
        int[] tab1 = new int[count];

        count = 0;
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] % 2 == 0) {
                    tab1[count] = tab[i];
                    count++;
                }
            }
            return tab1;
    }
}

