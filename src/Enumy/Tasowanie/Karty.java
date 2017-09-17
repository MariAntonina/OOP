package Enumy.Tasowanie;

import javafx.util.Pair;

import java.util.*;

import java.util.ArrayList;
//import org.mike.test.Pair;

/**
 * Created by admin on 16.09.2017.
 */
public class Talia {

    public enum figury {
        DWOJKA, TROJKA, CZWORKA, PIATKA, SZÓSTKA, SIÓDEMKA, OSEMKA,
        DZIEWIATKA, DZIEISATKA, WALET, DAMA, KRÓL, AS
    }

    public enum kolor {KIER, KARO, PIK, TREFL}

    public static void main(String[] args) {
        int[] figura = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9 ,10, 11, 12, 13};
        int[] kolor = {1, 2 ,3 ,4};

        List<Integer> listFigura = new ArrayList<>();
        List<Integer> listKolor = new ArrayList<>();

        for (int i = 0; i < figura.length; i++) {
            listFigura.add(figura[i]);
        }
        for (int i = 0; i < kolor.length ; i++) {
            listKolor.add(kolor[i]);

        }

        Collections.shuffle(listKolor);
        Collections.shuffle(listKolor);

        int [][] karty = new int[52][2];
        for (int i : listFigura) {
            for (int j : listKolor) {
                System.out.printf("(%d %d)\n", i, j);
            }
        }
int intex = 0;
        switch (intex) {
            case 1:
                karty[][1] = figura
            default:
                continue;
        }
    }
}
