package day25_constractors;

public class TestRectengleObject {
    public static void main(String[] args) {
        /*Rectangle rectangle1= new Rectangle();
        rectangle1.setInfo(5, 6);

        Rectangle rectangle2= new Rectangle();
        rectangle2.setInfo(5,8);

        Rectangle rectangle3= new Rectangle();
        rectangle3.setInfo(8,10);


        Rectangle rectangle4= new Rectangle();

        Rectangle rectangle5= new Rectangle();*/


        Rectangle rectangle1 = new Rectangle(12, 10);
        Rectangle rectangle2 = new Rectangle(6, 2);
        Rectangle rectangle3 = new Rectangle(5, 8);
        Rectangle rectangle4 = new Rectangle(7, 9);
        Rectangle rectangle5 = new Rectangle(16, 20);


        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);

    }
}