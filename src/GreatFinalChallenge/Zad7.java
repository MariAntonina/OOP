package GreatFinalChallenge;

/**
 * Created by admin on 07.09.2017.
 */
public class Zad7 {

    public static void main(String[] args) {

        String word = "przestrzal";
        rev(word);
    }

    static void rev(String word){
        int n = word.length();
        if (n  > 1){
            rev(word.substring(1));}
            System.out.print(word.charAt(0));
    }
}


