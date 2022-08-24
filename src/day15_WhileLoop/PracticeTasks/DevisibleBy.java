package day15_WhileLoop.PracticeTasks;

import java.util.Scanner;

public class DevisibleBy {
    public static void main(String[] args) {
        int num = 100;
        String Numper3 = "";
        String numper5 = "";
        String numper15 = "";

        for (int i = 0; i < num; i++) {
            if ( i % 15 == 0 ) {
                numper15 += i + " ";
            } else if ( i % 5 == 0 ) {
                numper5 += i + " ";
            } else if ( i % 3 == 0 ) {
                Numper3 += i + " ";
            } else {

            }
        }
        System.out.println("Numperthree = " + Numper3);
        System.out.println("numper5 = " + numper5);
        System.out.println("numper15 = " + numper15);

    }
}
