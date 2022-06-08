package day13_customMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        int result = addition(12, 12);
        System.out.println(result);

        int result1 = square(9);
        System.out.println(cube(9));
        System.out.println(result);

        int result3 = cube(4);
        System.out.println(result3);
    }

    public static int addition(int num1, int num2) {
        int result=num1 + num2;
        return result;
    }

    public static int square(int num) {
        int result;
        result = num * num;
        return result;
    }

    public static int cube(int num) {
        int result;
        result = num * num * num;
        return result;
    }
}
