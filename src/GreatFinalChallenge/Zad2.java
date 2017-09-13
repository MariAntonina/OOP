package GreatFinalChallenge;

import java.util.Stack;

/**
 * Created by admin on 11.09.2017.
 */
public class Zad2 {
    public static void main(String[] args) throws Exception {

        String str = "( 3 + 6*9)) ";
        char[] s1 = str.toCharArray();

        int open = 0;
        int close = 0;

        Stack<Character> stos = new Stack<>();

        for (Character mat : s1) {
            if (mat.equals('(')) {
                stos.push('(');
                open++;
            }
            if (mat.equals(')')){
                stos.push(')');
                close++;
            }
        }

        System.out.printf("Nawias otwierający: %d.\n Nawias zamykający: %d.", open, close);
        System.out.println();
        if (open != close) {
                System.out.println("Błędne sparowanie nawiasów");}
        else  if(open == 0 && close == 0){
            System.out.println("Brak nawiasów");
        }
        else{
            System.out.println("Poprawne sparowanie nawiasów");
        }
    }
}

