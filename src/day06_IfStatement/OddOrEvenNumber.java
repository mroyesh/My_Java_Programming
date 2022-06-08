package day06_IfStatement;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        int num = 20;
        boolean isEven = (num % 2 ==0);// when we divide number by a number if the reminder is zero.
        //boolean isOdd = (num1 % 2 != 0);
        boolean isOdd = !isEven;// if the number is odd it is not even.
        System.out.println(num + " is even number: "+ isEven);
        System.out.println(num + " is odd number: " + isOdd);


        /*output:
        200 is positive number: true
        200 is negative number: false
        200 is zero: false*/
    }
}
