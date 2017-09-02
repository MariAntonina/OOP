package Sorter;

/**
 * Created by admin on 28.08.2017.
 */
public class Babelki implements ISortowanie{

    protected ISortowanie sotowanie;

    @Override
    public int[] sort(int[] tab) {
         for (int i = 0; i < tab.length ; i++) {
             for (int j = 0; j < tab.length - 1; j++){
                 if(tab[i]<=tab[j]){
                     int temp = tab[i];
                     tab[i] =  tab[j];
                     tab[j] = temp;
                 }
             }
         }
         return tab;
     }
}
