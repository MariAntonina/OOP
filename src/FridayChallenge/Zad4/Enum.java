package FridayChallenge.Zad4;

import java.util.Scanner;

/**
 * Created by admin on 25.08.2017.
 */
public class Enum {

    public enum ThrowOfCoin {REVERSE, TAILS, Q}

    public enum GameStats {WIN, LOSS, STOP}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ThrowOfCoin myMove = ThrowOfCoin.REVERSE;
        ThrowOfCoin comMove = null;

        int goodGuess = 0;
        int wrongGuess = 0;
        int numOfGames = 0;

        while (!myMove.equals(ThrowOfCoin.Q)) {
            System.out.printf("Your guess:");
            String choice = sc.nextLine();
            switch (choice.toLowerCase()) {
                case "r":
                    myMove = ThrowOfCoin.REVERSE;
                    break;
                case "t":
                    myMove = ThrowOfCoin.TAILS;
                    break;
                case "q":
                    myMove = ThrowOfCoin.Q;
                    break;
                default:
                    continue;
            }


            double pick = Math.random();
            if (pick < 0.5) {
                comMove = ThrowOfCoin.TAILS;
                System.out.println("Computer pick  TAILS");
            } else {
                comMove = ThrowOfCoin.REVERSE;
                System.out.println("Computer pick  REVERSE");
            }

            GameStats result = didIGuess(myMove, comMove);

            if (result.equals(GameStats.WIN))
                goodGuess++;
            else if (result.equals(GameStats.LOSS))
                wrongGuess++;
            else// if(!result.equals(GameStats.WIN)|| !(result.equals(GameStats.WIN)))
                System.out.println("The End");

            numOfGames++;
        }

        System.out.printf("You just played %d games. You won: %d times (%f). You lost: %d (%f)",
                numOfGames-1, goodGuess, (double) goodGuess / (numOfGames-1) * 100,
                wrongGuess, (double) wrongGuess / (numOfGames-1) * 100);
    }

    public static GameStats didIGuess(ThrowOfCoin myMove, ThrowOfCoin comMove) {
        if (myMove.equals(ThrowOfCoin.REVERSE) &&
                comMove.equals(ThrowOfCoin.REVERSE))
            return GameStats.WIN;

        if (myMove.equals(ThrowOfCoin.TAILS) &&
                comMove.equals(ThrowOfCoin.REVERSE))
            return GameStats.LOSS;

        if (myMove.equals(ThrowOfCoin.TAILS) &&
                comMove.equals(ThrowOfCoin.TAILS))
            return GameStats.WIN;

        if (myMove.equals(ThrowOfCoin.REVERSE) &&
                comMove.equals(ThrowOfCoin.TAILS))
            return GameStats.LOSS;

        return GameStats.STOP;
    }
}
