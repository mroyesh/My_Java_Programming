package day07_ifStatement;

public class PosNegZero {
    public static void main(String[] args) {
        int num = -70;
        String result = "";
        if (num > 0) {
            result = "Positive";
        } else if (num < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }
        System.out.println(result);
    }
 }


