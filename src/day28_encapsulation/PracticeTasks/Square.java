package day28_encapsulation.PracticeTasks;

public class Square {

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if ( side < 0 ) {
            System.out.println("Side of square can not be negative");
            System.exit(1);
        }
        this.side = side;
    }


    public double calcArea() {
        return side * side;
    }

    public double calcPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "Area of the square is: =" + calcArea() +
                "Perimeter of the square is: =" + calcPerimeter() +
                '}';
    }
}
