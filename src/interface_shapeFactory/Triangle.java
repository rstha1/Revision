package interface_shapeFactory;

public class Triangle implements Shape{
    private double base;
    private double height;
    private double length2;
    private double length3;

    public Triangle(){
    }

    public Triangle(double base, double height, double length2, double length3) {
        this.base = base;
        this.height = height;
        this.length2 = length2;
        this.length3 = length3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getLength3() {
        return length3;
    }

    public void setLength3(double length3) {
        this.length3 = length3;
    }

    @Override
    public double area() {
        double area = 1.0/2 * base * height;
        return area;
    }

    @Override
    public double perimeter() {
       double perimeter = base + length2+ length3;
       return perimeter;
    }
}
