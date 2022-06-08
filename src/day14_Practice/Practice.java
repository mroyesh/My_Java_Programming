package day14_Practice;

public class Practice {
    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FINRA");
            } else if ( i % 3 == 0 ) {
                System.out.println("FIN");
            } else if ( i % 5 == 0 ) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }


        }


        /*for (int i = 1; i <= 100; i++) {
            if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.print(" FINRA");
            } else if ( i % 3 == 0 ) {
                System.out.print(" FIN");
            } else if ( i % 5 == 0 ) {
                System.out.print(" RA");
            } else {
                System.out.print(" " + i);*/
            }


        }




