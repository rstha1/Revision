package for_loop;

import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void main(String[] args) {

    Scanner scr = new Scanner(System.in);

    System.out.println("Enter number");
    int num = scr.nextInt();
    int i = 1;

    while (i <= num){
        System.out.println(i);
        i++;
    }

    }
}
