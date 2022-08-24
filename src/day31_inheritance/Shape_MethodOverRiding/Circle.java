package day31_inheritance.Shape_MethodOverRiding;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14* radius* radius;
    }

    @Override
    public double perimeter() {
        return 2* 3.14*radius;
    }

    @Override
    public void draw() {
        System.out.println("        *        ");
        System.out.println("     *     *     ");
        System.out.println("   *         *   ");
        System.out.println("     *      *    ");
        System.out.println("         *       ");

    }

}










