package day36_polymorphism;

import day30_inheritance.TaskSolutions.deviceTasks.Iphone;

public class TestEqualsMethod {
    public static void main(String[] args) {


       Circle circle1= new Circle(5);

       Circle circle2= new Circle(5);

       Circle circle3= new Circle(15);


        System.out.println(circle1== circle2);

        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));

        System.out.println("----------------------------");


        IPhone iPhone1= new IPhone("IPhone", "IPhone12 Max","large", "Black", 900);
        IPhone iPhone2= new IPhone("IPhone","IPhone12 Max", "large", "Black",900 );

        System.out.println(iPhone1.equals(iPhone2));

        Square square1 = new Square(12);
        Square square2= new Square(12);

        System.out.println(square1.equals(square2));
    }

}
