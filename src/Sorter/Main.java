package Sorter;

/**
 * Created by admin on 28.08.2017.
 */
public class Main {

    public static void main(String[] args) {

        Sorterr sorterr = new Sorterr(new Babelki());
        int[] tabToSort = {2,4,6,3,12,4,3,5,3};
        int[] sorted =  sorterr.doSorting(tabToSort);

        for (int element : sorted) {
            System.out.print(element);
        }
    }
}
