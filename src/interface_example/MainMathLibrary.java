package interface_example;

import java.util.Scanner;

public class MainMathLibrary {
    public static void main(String[] args) {
        Circle c = null;
        Rectangle rec = null;

        boolean result = false;

        Scanner scr = new Scanner(System.in);

        while(result == false){
            System.out.println("Enter the input");
            double radius = scr.nextDouble();

             result = InputChecker.isValid(radius);

            if(result == false){
                System.out.println("Enter valid input");
            } else {
                c = new Circle(radius);
            }
        }

        boolean result1 = false;

        while(result1 == false) {
            System.out.println("Enter the length");
            double length = scr.nextDouble();
            System.out.println("Enter the breadth");
            double breadth = scr.nextDouble();
            result1 = InputChecker.isValid(length) && InputChecker.isValid(breadth);
            if (result1 == false) {
                System.out.println("Enter valid input");
            } else {
                rec = new Rectangle(length, breadth);
            }

        }

        System.out.println("Area of circle is " + c.area());
        System.out.println("Perimeter of circle is " + c.perimeter());
        System.out.println("Area of rectangle is " + rec.area());
        System.out.println("Area of rectangle is " + rec.perimeter());

    }
}
