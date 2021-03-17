package interface_shapeFactory;

import java.util.Scanner;

public class MainMethodShape {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter shape");
        String shape = scr.next();

        ShapeFactory shFactory = new ShapeFactory();
        Shape shape1 = shFactory.getShape(shape);

        System.out.println(shape1.area());
        System.out.println(shape1.perimeter());


    }

}
