package day36_polymorphism;

public class Circle {
    private double radius;
    public final static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * pi;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius= " + radius +
                ", Area= " + area() +
                ", perimeter= " + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Circle) ) {
            System.out.println("Invalid object");
            System.exit(1);
        }
        if ( this.radius == ((Circle) obj).radius ) {
            return true;
        }
        return false;


    }
}
