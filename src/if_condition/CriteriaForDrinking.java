package if_condition;

import java.util.Scanner;

public class CriteriaForDrinking {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter age");
        int age = scr.nextInt();

        if(age > 21 ){
            System.out.println("Eligible to drink");
        }
        else{
            System.out.println("minor");
        }

    }
}
