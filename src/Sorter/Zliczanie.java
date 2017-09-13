package Sorter;

/**
 * Created by admin on 28.08.2017.
 */
public class Zliczanie implements ISortowanie {

    @Override
    public int[] sort(int[] tab) {

        int n = tab.length;
        int max = 0;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (tab[i] > max)
                max = tab[i];
        }

        int[] helpDesk = new int[max+1];

        for (int i = 0; i < tab.length; i++) {
            int liczba = tab[i];
            helpDesk[liczba]++;
        }

        int [] tabSorted = new int[n];

        for (int indeksTab = 0; indeksTab < helpDesk.length; indeksTab++) {
            for (int ileLiczb = helpDesk[indeksTab]; ileLiczb != 0; ileLiczb--) {
                tabSorted[counter]=indeksTab;
                helpDesk[indeksTab]--;
                counter++;
            }
        }
        return tabSorted;
    }
}
