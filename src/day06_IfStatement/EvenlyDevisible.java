package day06_IfStatement;

public class EvenlyDevisible {
    public static void main(String[] args) {
        int number = 288;
        boolean isDivisibleBy2 = number % 2 ==0;
        boolean isDividableBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 ==0;
        System.out.println(number+ " is divisible by 2:  " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3: " + isDividableBy3);
        System.out.println(number+ " is divisible by 5: " + isDivisibleBy5);

    }
}
