package day04_concatenation;

public class Casting {
    public static void main(String[] args) {

        byte x = 23;
        double y = (double)x;

        System.out.println(x);
        System.out.println(y);

        // explicit Casting------------
        int a = 100;
        byte b = (byte)a;
        System.out.println(a);
        System.out.println(b);
        double n1 = 2.5;
        byte n2 = (byte)n1;
        int r = 127;
        short t = (short) r;
        System.out.println(t);

        double d = 4900000;
        int e = (int) d;
        System.out.println(e);


    }
}
