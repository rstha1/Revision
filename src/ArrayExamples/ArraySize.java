package ArrayExamples;

import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter array size");

        int size= scr.nextInt();

        int[] num = new int[size];

        for(int i = 0; i< size; i++) {
            System.out.println("Enter the number");
            int number = scr.nextInt();
            num[i] = number;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }


    }
}
