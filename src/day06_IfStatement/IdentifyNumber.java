package day06_IfStatement;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 9;
        boolean isPositive = number >  0;// if the number is greater than zero it is positive number.
        boolean isNegative = number < 0; // if th number is negative.
        //boolean isZero = number ==0;
        boolean isZero = !isNegative && !isPositive;
        System.out.println( number+ " Is positive number: " + isPositive);
        System.out.println(number + " Is negative number: " + isNegative);
        System.out.println( number+ " Is Zero = " + isZero);


    }
}
