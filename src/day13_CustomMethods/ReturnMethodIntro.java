package day13_CustomMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        sum(12, 12);
        square(9);
        cube(5.3);



        /* addition(12, 12);
        //System.out.println(result);

        int result1 = square(9);
        System.out.println(result1);

        //System.out.println(result);

        int result3 = cube(4);
        System.out.println(cube(9));
        System.out.println(result3);
    }

    public static int addition(int num1, int num2) {
        int result=num1 + num2;
        System.out.println("result equals to: "+result);
        return result;
    }

    public static int square(int num) {
        int result= num * num;
        return result;
    }

    public static int cube(int num) {
        int result;
        result = num * num * num;
        return result;
    }
}

         */


    }

    public static int sum(int n1, int n2) {
        int add = n1 + n2;
        System.out.println("Adding two numbers are : "+ add);
        return add;

    }

    public static int square(int num) {
        int result = num * num;
        System.out.println("Squaring a number is:  "+result);
        return result;


    }

    public static double cube(double num1) {
        double result = num1 * num1 * num1;
        System.out.println("Cubing "+num1+ " is: "+result);
        return result;
    }
}



