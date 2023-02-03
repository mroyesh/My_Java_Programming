package day10_String;
import java.util.Scanner;
import java.lang.String;
import java.lang.System;
public class StringIntro {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str = new String(" ");
        String s1="cat";  // String literal.
        String s2= "dog";
        String str3= new String("Happy");

        System.out.println(str);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(str3);

        String s3= "cat";
        String s4= "cat";

        System.out.println(s1 ==s3);
        System.out.println(s1==s4);
        System.out.println("---------------");
        String str1= new String("java"); // any String literal will be created if they are same they take one in the string pool

        String step2 = new String("java");

        System.out.println("--------------");

        String t1="Python";
        String t2= new String("Python");
        System.out.println(t2);

        System.out.println("This is the end of our semester");




    }
}
