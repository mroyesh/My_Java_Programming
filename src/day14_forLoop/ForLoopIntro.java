package day14_forLoop;

import java.util.Scanner;

public class ForLoopIntro {
    public static void main(String[] args) {


        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

        System.out.println("---------------------------");


        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello world");
        }

        System.out.println("-----------------------------");


        for (int i = 10; i > 5; i--) {
            System.out.println("hello Cydeo "+i);
        }


            System.out.println("--------------------------------");


            int sum = 0;
            for (int j = 1; j <= 100; j++) {
                sum += j;
            }
            System.out.println(sum);

            System.out.println("------------------------------------");


            for(char k='A'; k<='Z'; k++){
                System.out.print(k+" ");
            }
        System.out.println();

        System.out.println("--------------------------------------------");


            for(char l='Z'; l>='A';l--){
                System.out.print(l+", ");
            }






        }

        /*String a = "I love you";
        String c = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            c += a.charAt(i);
        }
        System.out.println(c);


        String d = "happy";
        String b = "";
        for (int i = d.length() - 1; i >= 0; i--) {
            b += d.charAt(i);
        }
        System.out.println(b);


        for (int i = 0; i < 5; i++) {

            System.out.println(i);

        }*/
    }









