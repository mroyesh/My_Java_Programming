package day15_WhileLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if ( i == 60 ) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'A'; i < 'Z'; i++) {
            if ( i >= 'P' ) {
                break;
            }
            System.out.print(i+" ");
        }
    }
}