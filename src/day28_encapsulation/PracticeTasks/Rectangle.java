package day28_encapsulation.PracticeTasks;

public class Rectangle {
    private int width;
    private int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if ( width < 0 ) {
            System.err.println("Width of the Circle can not be negative" + width);
            System.exit(1);
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if ( length < 0 ) {
            System.err.println("Length of the Circle can not be negative");
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle(int width, int length) {
        setWidth(width);
        setLength(length);
    }

    public double calcArea() {
        return width * length;

    }

    public double calcPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Area of rectangle is: = " + calcArea() +
                ", perimeter of rectangle is:= " + calcPerimeter() +
                '}';
    }
}
