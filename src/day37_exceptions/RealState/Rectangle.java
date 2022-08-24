package day37_exceptions.RealState;

public class Rectangle extends Shape {

    int width, length;


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }


}
