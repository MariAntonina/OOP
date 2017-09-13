package GreatFinalChallenge;

/**
 * Created by admin on 12.09.2017.
 */
public class Zad6 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        int w = (matrix.length);
        int k = (matrix[0].length);
        int x = 1;
        int x1 = 3;
        int sizeX = 2;
        int y1 = 2;
        int sizeY = 2;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = x;
                if (x < 10) {
                    System.out.print(" " + x + " ");
                } else {
                    System.out.print(x + " ");
                }
                x++;
            }
            System.out.println();
        }
        System.out.println();

        for (int i = x1; i < x1+sizeX ; i++) {
            for (int j = y1; j < y1 + sizeY ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

