package GreatFinalChallenge;

import java.util.Random;

/**
 * Created by admin on 07.09.2017.
 */
public class Zad3 {

    public static void main(String[] args) {

        int n = 5;
        int a = 0;
        int dodatnie = 0;
        int ujemne = 0;
        double stosunekDodatni = 0;
        double stosunekUjemny = 0;
        int max = -100;
        int min = 100;
        int [] tab = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a = rand.nextInt(200) - 100;
            if (a <= 0) {
                ujemne++;
            }
                tab[i] = a;
            }

        for (int i = 0; i < n ; i++) {
            if (tab[i]> max){
                max = tab[i];
            }
            if(tab[i] < min){
                min = tab[i];
            }
        }

        dodatnie = n - ujemne;
        stosunekDodatni = (double) dodatnie/n;
        stosunekUjemny = (double) ujemne/n;

        System.out.printf("Dla %d losowan stosunek liczb dodatnich do ujemnych był: %.2f do %.2f. Max: %d, min: %d.",
                n, stosunekDodatni, stosunekUjemny, max, min);
    }
}
