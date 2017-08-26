package FridayChallenge.Zad3;

/**
 * Created by admin on 25.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        Student st = new Student("Eustachy", "Rzólowa 5", "Resocjalizacyjny", 7,666 );
        System.out.println(st);

        Staff staf = new Staff("Wiktor", "ul.Pingwinowa 3", "Szkoła podopiecznych Wielkiego Balu",
                456.789);
        System.out.println(staf);
    }
}
