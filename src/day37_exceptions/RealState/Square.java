package day37_exceptions.RealState;

import java.util.ArrayList;

public class Square extends Shape {

    double side;
    public Square( double side) {
        this.side = side;
    }






    @Override
    public double area() {
        return side * side;

    }



}
