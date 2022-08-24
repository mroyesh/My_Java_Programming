package day37_exceptions.RealState;

import java.util.ArrayList;
import java.util.Arrays;

public class TestObjects {
    public static void main(String[] args) {
        Square square1 = new Square( 20);
        square1.area();

        Square square2= new Square(25);
        square2.area();

        Square square3= new Square( 30);
        square3.area();


        System.out.println("--------------------------------------");


        Rectangle rectangle1= new Rectangle(20, 30);

        Rectangle rectangle2= new Rectangle(20, 25);



        System.out.println("--------------------------------------");

        Circle circle1= new Circle(15, 3.14);

        Circle circle2= new Circle(20, 3.14);

        Circle circle3= new Circle(30, 3.14);

        Shape[] shapes= {circle1, circle2, circle3, square1, square2, square3, rectangle1, rectangle2 };

      for(double i=0; i< shapes.length; i++){


          }


      }


    }

