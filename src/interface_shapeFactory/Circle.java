package interface_shapeFactory;

public class Circle implements Shape {

    private double radius;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI* radius* radius;
        return area;
    }

    @Override
    public double perimeter() {
        double peri = 2* Math.PI * radius;
        return peri;
    }
}
