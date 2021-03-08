package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNumbersToArrayList {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number");
            int num = scr.nextInt();

            list.add(num);
        }
            System.out.println(list);
    }
}
