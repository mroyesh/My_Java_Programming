package day27_accessModifier;
public class Circle {

    public double radius;
    public double diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcArea() {
        return radius * radius * pi;

    }

    public double calcParameter() {
        return diameter * pi;

    }
    public static void PrintPiValue(){
        System.out.println("Pi value is : "+pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", Pi =" + pi +
                ", Area of circle=" + calcArea()+
                ", perimeter=" + calcParameter()  +
                '}';
    }
}
