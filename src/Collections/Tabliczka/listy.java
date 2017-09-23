package Collections.Tabliczka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by admin on 22.09.2017.
 */
public class Main {
    public static void main(String[] args) {

// ZAD1
        int[] tab1 = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] tab2 = {13, 2, 3, 4, 5, 6, 7, 8, 9, 20};

        List li1 = Arrays.asList(tab1);
        List li2 = Arrays.asList(tab2);

        System.out.println(li1);
        System.out.println(li2);

        System.out.println(li1.size());
        System.out.println(li2.size());

        ///ZAD 2

        List<Integer> integersListCopy = new ArrayList();
        integersListCopy.addAll(li2);
        System.out.println(integersListCopy);

        List<Integer> intsListCopy = new ArrayList();
        integersListCopy.addAll(li1);
        System.out.println(intsListCopy);

        ArrayList lista = new ArrayList();
        Collections.addAll(lista, li1, li2, tab1, tab2);
//        System.out.println(lista);

        Collections.addAll(lista,tab1, tab2);
        System.out.println(lista);
        ///ZAD3 and 4
        Collections.reverse(li1);
        System.out.println(li1);
        Collections.reverse(li2);
        System.out.println(li2);



    }




}
