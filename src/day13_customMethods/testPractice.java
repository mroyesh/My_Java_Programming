package day13_customMethods;

public class testPractice {
    public static void main(String[] args) {
         areEligible(160);

        boolean result= isOddd(34);

        int mins= isMin(12,16);
        System.out.println("mins = " + mins);

        System.out.println(" the number is "+result);
        boolean result2 = isOdd(590);
        System.out.println(result2);
        int result3 = isMax(32, 600);
        System.out.println(result3 + " is the max number");
        int result1 = isMin(23, 4);
        System.out.println(result1 + " is min number");

    }
    public static boolean isOddd(int n1){
        if(n1 % 2 !=0){
            return true;
        }else{
            return false;
        }
    }


    public static boolean isOdd(int n) {
        if ( n % 2 != 0 ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int n1) {
        return !isOdd(n1);

    }

    public static int isMax(int num1, int num2) {
        if ( num1 > num2 ) {
            return num1;
        } else {
            return num2;
        }

    }

    public static int isMin(int num5, int num6) {
        if(num5>num6){
            return num5;
        }else{
            return num6;
        }
    }

    public static void areEligible(int age){
        if(age<=1 || age >=120){
            System.err.println("not valid entry");
            return;
        }
        if(age>=21){
            System.out.println("you are eligible to purchase alcohol");
        }else{
            System.err.println("sorry you are not eligible");
        }
    }
}

