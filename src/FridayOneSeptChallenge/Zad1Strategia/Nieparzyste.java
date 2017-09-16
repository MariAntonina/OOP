package FridayOneSeptChallenge.Zad1Strategia;

/**
 * Created by admin on 02.09.2017.
 */
public class Nieparzyste implements IOblicz {

    @Override
    public int[] uruchom(int [] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 1) {
                count++;
            }
        }
        int[] tab2 = new int[count];
        count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 1) {
                tab2[count] = tab[i];
                count++;
            }
        }
        return tab2;
    }
}
