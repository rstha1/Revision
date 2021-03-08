package interface_example;

public class Rectangle implements MathLibrary{

    private double length;
    private double breadth;

    public Rectangle(){
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double area() {
       double area1 = length * breadth;
        return area1;
    }

    @Override
    public double perimeter() {
        double peri1 = 2 * (length + breadth);
        return peri1;
    }
}
