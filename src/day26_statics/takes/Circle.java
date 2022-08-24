package day26_statics.takes;

public class Circle {
    public double radius;
    public double diameter;
    public static double pi= Math.PI;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
    public double calcArea(){
        return radius*radius*pi;

    }
    public double diameter(){
        return radius*radius*2;

    }
    public double pi(){
        System.out.println("the Pi value is: "+ pi());
        return pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
