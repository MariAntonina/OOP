package GreatFinalChallenge;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by admin on 12.09.2017.
 */
public class Zad8{

    public static void main(String[] args) throws IOException {

        File tekst = new File("C:\\Users\\admin\\Desktop\\Babo.txt");
        try (Scanner pliczek = new Scanner(new FileInputStream(tekst))) {
            int count = 0;
            while (pliczek.hasNext()) {
                pliczek.next();
                count++;
            }
            System.out.println("Liczba słów: " + count);
        }
    }
}
