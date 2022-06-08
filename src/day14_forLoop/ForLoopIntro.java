package day14_forLoop;

import java.util.Scanner;

public class ForLoopIntro {
    public static void main(String[] args) {

        String a= "I love you";
        String c="";
        for (int i = a.length()-1; i >=0 ; i--) {
            c+=a.charAt(i);
        }
        System.out.println(c);








        String d= "happy";
        String b= "";
        for (int i = d.length()-1; i >=0; i--) {
            b+=d.charAt(i);
        }
        System.out.println(b);



        for (int i = 0; i <5 ; i++) {

            System.out.println(i);

        }
        }






}

