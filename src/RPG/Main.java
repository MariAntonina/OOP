package RPG;

/**
 * Created by admin on 30.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        Tarcza tarcza = new TarczaZZolwiaTeodora();
        Miecz miecz = new DzikaTrabaMamuta();
        Plecak plecak = new ZielarskiPlecakWloczykija();
        Bohater Czeslaw = new Bohater("Czesław", tarcza, miecz, plecak);

        System.out.printf("Nazwa: %s :: Zawartosc alkoholu %s, %s , %s",
                Czeslaw);



    }
}
