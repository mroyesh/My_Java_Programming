package day37_exceptions.RealState;

public class Circle extends Shape {

    public double radius;
    public double Pi = 3.14;

    public Circle(double radius, double pi) {
        this.radius = radius;
        Pi = pi;
    }

    @Override
    public double area() {
        return radius * radius * Pi;

    }

}