package Collections.Zbiory;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by admin on 23.09.2017.
 */
public class Main {

    public static void main(String[] args) {
//"Stefania", "Korneliusz"

        String[] Nazwiska = {"Niewłasciwy", "Asesor", "Przetracony", "Plugawy", "Turet"};
        String [] Imiona = {"Stefcio", "Filipek", "Eustachy", "Asesor", "Turet"};

        TreeSet drzewny = new TreeSet();
        TreeSet drzewny1 = new TreeSet();
        for (int i = 0; i < Nazwiska.length; i++) {
            drzewny.add(Nazwiska[i]);
        }
        for (int i = 0; i < Imiona.length ; i++) {
            drzewny1.add(Imiona[i]);
        }
        System.out.println(drzewny);
        System.out.println(drzewny1);




        HashSet krzyrzykowy = new HashSet();
        HashSet krzyrzykowy1 = new HashSet();

        for (Object n :Nazwiska) {
            krzyrzykowy.add(n);
        }
        for (Object i : Imiona) {
            krzyrzykowy1.add(i);
        }

//        System.out.println(krzyrzykowy);
//        System.out.println(krzyrzykowy1);

        System.out.println("------------------------");
        for (Object n :krzyrzykowy) {
            for (Object i : krzyrzykowy1) {
                if(n.equals(i)){
                    System.out.println(n);
                }
            }
        }
        System.out.println("--------------------------");
        for (Object n :drzewny) {
            for (Object i : drzewny1) {
                if(n.equals(i)){
                    System.out.println(n);
                }
            }
        }
        System.out.println("sharp \n" +
                "vs\n" +
                " drzewo\n");

        for (Object n :krzyrzykowy) {
            for (Object i : drzewny1) {
                if(n.equals(i)){
                    System.out.println(n);
                }
            }
        }

        System.out.println("\n" +
                "Kontejn" );

        for (Object o : krzyrzykowy) {
            if (krzyrzykowy1.contains(o))
                System.out.println(o);
        }

    }
}
