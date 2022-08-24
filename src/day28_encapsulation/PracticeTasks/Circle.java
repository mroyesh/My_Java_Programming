package day28_encapsulation.PracticeTasks;

public class Circle {
    private int radius;
    public static double pi = 3.14;

    public Circle(int radius) {
        setRadius(radius);
    }

    public int getRadius() {

        return radius;
    }

    public void setRadius(int radius) {
        if ( radius <= 0 ) {
            System.err.println("invalid radius " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea() {
        return radius * radius * pi;
    }

    public double calcPerimeter() {
        return 2 * pi * radius;
    }

    public String toString() {
        return "Circle{" +
                " radius=" + getRadius() +
                ", Area =" + calcArea() +
                ", Perimeter =" + calcPerimeter() +
                '}';
    }
}
