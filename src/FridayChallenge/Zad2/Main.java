package FridayChallenge.Zad2;

/**
 * Created by admin on 26.08.2017.
 */
public class Main {

    public static void main(String[] args) {

        Person per = new Person("Jan", "Kowalski", "44051401458");

        BirthDay b = new BirthDay(per);
        System.out.println(b);
//        per.getBirthDay();
//        System.out.println(per);

    }


}

