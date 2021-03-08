package doubleDimensionalArray;

import java.util.Scanner;

public class Creating2DArray {
    public static void main(String[] args) {

        int [][] matrix = new int [3][3];

        Scanner scr = new Scanner(System.in);

        for (int i = 0; i< 3; i++ ){
            for(int j = 0; j< 3; j++){
                System.out.println("Enter the number");
                 matrix[i][j]= scr.nextInt();
            }
        }
        for (int i = 0; i< 3; i++ ) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

}
