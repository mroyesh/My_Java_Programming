package day31_inheritance.Shape_MethodOverRiding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(4);
        System.out.println(square);

        square.draw();

        Circle circle= new Circle(6);
        System.out.println(circle);

        circle.draw();
        System.out.println(circle.area());
        circle.perimeter();

        Rectangle rectangle= new Rectangle(6, 10);
        System.out.println("Area of rectangle is: "+rectangle);
        rectangle.draw();
    }

}
