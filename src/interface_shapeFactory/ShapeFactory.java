package interface_shapeFactory;

import java.util.Scanner;

public class ShapeFactory {

    private Scanner scr = new Scanner(System.in);
    public Shape getShape(String shape){
        if(shape.equals("Circle")){
            System.out.println("Enter radius");
            double radius = scr.nextDouble();
            return new Circle(radius);
        }

        if(shape.equals("Rectangle")){
            System.out.println("Enter length");
            double length = scr.nextDouble();
            System.out.println("Enter breadth");
            double breadth = scr.nextDouble();
            return new Rectangle(length, breadth);
        }
        if(shape.equals("Triangle")){
            return new Triangle();
        }
         else  {
             return null;
        }
    }
}
