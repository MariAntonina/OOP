package GreatFinalChallenge;

/**
 * Created by admin on 07.09.2017.
 */
public class Zad5 {
    public static void main(String[] args) {

        int[][] matrix = new int[2][2];
        //int [][] matrix = new int [][]{ { 2,4}, {6,8}, {10,12}, {14,16}};

        int w = (matrix.length);
        int k = (matrix[0].length);
        int z = 0;
        
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = z;
                if (z < 10) {
                    System.out.print(" " + z + " ");
                } else {
                    System.out.print(z + " ");
                }
                z++;
            }
            System.out.println();
        }
        System.out.println();

//        for (int i = 0; i < w; i++) {
//            for (int j = 0; j < k; j++) {
//                if(matrix[i][j]<10){
//                System.out.print(" " + matrix[i][j] + " ");}
//                else {System.out.print( matrix[i][j] + " ");}
//            }
//            System.out.println();
//        }
//        System.out.println();


         int[][] matrixMirrorOX = new int[w][k];
         int[][] matrixMirrorOY = new int[w][k];
         int[][] matrixMirrorXY = new int[w][k];

         // Odbicie OX
        for (int m = 0; m < w ; m++) {
            for (int l = 0; l < k ; l++) {
                matrixMirrorOX[m][l]= matrix[w-m-1][l];
                System.out.print(matrixMirrorOX[m][l] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Obicie OY
        for (int m = 0; m < w ; m++) {
            for (int l = 0; l < k ; l++) {
                matrixMirrorOY[m][l]= matrix[m][k-1-l];
                System.out.print(matrixMirrorOY[m][l]  +" ");
            }
            System.out.println();
        }
        System.out.println();

        // Odbicie XY
        for (int m = 0; m < w ; m++) {
            for (int l = 0; l < k ; l++) {
                matrixMirrorXY[m][l]= matrix[w-m-1][k-1-l];
                System.out.print(matrixMirrorXY[m][l] + " ");
            }
            System.out.println();
        }
    }
}