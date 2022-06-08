package day06_IfStatement;

public class MaximumNumber {
    public static void main(String[] args) {
        int n1 = 0,
                n2 = 0,
                n3 = 0;
        if(n1 > n2 && n1>n3){
            System.out.println(n1 + " is the maximum number");
        }
        if (n2 > n1 && n2> n3) {
            System.out.println(n2 + " is the maximum number");
        }
            if(n3 >n2 && n3 >n1) {
                System.out.println(n3 + " is the max number");
            }
            if (n1 ==n2 && n1 == n3){
                System.out.println(n1 +"= " + n2 + "= " + n3 + "= Zero");
            }
    }
}
