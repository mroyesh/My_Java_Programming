package day14_forLoop;

public class MethodOverLoadingPractice {
    public static void main(String[] args) {
        System.out.println(sum(12, 12));
        System.out.println(sum(12, 12, 12));
        System.out.println(sum(12, 12, 12, 12));
        System.out.println(sum(2.4,3.4));
        System.out.println(sum(2.3,4.3,3.5));

    }
    public static int sum(int n1, int n2){
        return n1+n2;
    }
    public static int sum(int n1, int n2, int n3){
        return sum(n1, n2)+n3;
    }
    public static int sum(int n1, int n2, int n3, int n4){
        return sum(n1,n2,n3)+n4;
    }
    public static double sum(double n1, double n2){
        return n1+n2;
    }
    public static double sum(double n1, double n2, double n3){
        return sum(n1, n2)+n3;
    }
}
