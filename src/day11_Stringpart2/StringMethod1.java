package day11_Stringpart2;

import java.util.Locale;

public class StringMethod1 {
    public static void main(String[] args) {
        String str= " I love java";
        str=str.toUpperCase();
        System.out.println(str);

        /*System.out.println("------------");
        String str2= "happy new year";
        str2=str2.toLowerCase();
        String str3=str2.toUpperCase();//same as below line
        System.out.println(str2);

        System.out.println("-----------");
        String word = "Wooden Spoon";
        word.toUpperCase();
        word = word.toUpperCase();
        System.out.println(word);
        word.toLowerCase();
        word=word.toLowerCase();
        System.out.println(word);
        System.out.println("-------------");

        String str4 = "      cyedo";
        str4=str4.trim();
        System.out.println(str4);

        String sentences= "Today is Sunday, and we have java class";
        int index1 =sentences.indexOf('w');
        System.out.println(index1);

        String s1=" I love Java programming ";
        int firstA = s1.indexOf('a');
        System.out.println(firstA);
        int secondA= s1.indexOf("a ");*/

        String s2 = "Java Python javaScript Cydeo ython";
        int a3 =s2.indexOf("avaS");
        System.out.println(a3);

        System.out.println("------------");

        String w = "java";
        String w11= w.replaceFirst("a","WW");
        System.out.println("ww1 is the new " +w11);
        System.out.println(w.indexOf('a'));
        System.out.println(w.lastIndexOf('a'));

        String Alpha= "java";
        System.out.println(Alpha);


        System.out.println("---------------------");




    }
}
