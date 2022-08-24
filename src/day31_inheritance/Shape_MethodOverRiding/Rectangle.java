package day31_inheritance.Shape_MethodOverRiding;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (width*2) + (length*2);
    }

    @Override
    public void draw() {
        System.out.println("*  *  *  *  *  *  *");
        for (int i = 0; i <7 ; i++) {
            System.out.println("*                 *");
        }
        System.out.println("*  *  *  *  *  *  *");
    }
}
