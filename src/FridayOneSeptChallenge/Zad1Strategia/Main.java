package FridayOneSeptChallenge.Zad1Strategia;

/**
 * Created by admin on 02.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] tab = new int[]{2, 3, 5, 5, 3, 2, 6};
        StrategiaKoniaBonifacego strategy = new StrategiaKoniaBonifacego(new Parzyste());
        int[] result = strategy.uruchom(tab);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        StrategiaKoniaBonifacego strategy1 = new StrategiaKoniaBonifacego(new Nieparzyste());
        int[] result1 = strategy1.uruchom(tab);
        for (int i : result1) {
            System.out.print(i + " ");
        }

    }
}
