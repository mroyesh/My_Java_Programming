package day15_practice;

import java.util.Scanner;

public class DevisibleBy {
    public static void main(String[] args) {
        int num=100;
        String Numperthree ="";
        String numper5 = "";
        String numper15 = "";

        for (int i = 0; i < num; i++) {
            if ( i % 3 == 0 && i % 5 == 0 && i % 15 == 0 ) {
                numper15 += i+ " ";
            } else if ( i % 5 == 0 ) {
                numper5 += i+" ";
            }else if(i%3==0){
                Numperthree+=i+" ";
            }else{

            }
        }
        System.out.println("Numperthree = " + Numperthree);
        System.out.println("numper5 = " + numper5);
        System.out.println("numper15 = " + numper15);

    }
}
