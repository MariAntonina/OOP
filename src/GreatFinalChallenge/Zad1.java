package GreatFinalChallenge;

/**
 * Created by admin on 07.09.2017.
 */
public class Zad1 {

    public static void main(String[] args) {

        String string = "y Poszedl Kuba na wagary by podgladać koksa bary.";
        char[] str = string.toLowerCase().toCharArray();
        char first = string.toLowerCase().charAt(0);
        int sum = 0;

        for (int i = 2; i < str.length ; i++) {
            if (str[i] == first) {
                sum ++;
            }
        }
        System.out.print(sum);
    }
}
