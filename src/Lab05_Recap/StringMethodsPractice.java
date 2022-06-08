package Lab05_Recap;

import java.util.Scanner;

public class StringMethodsPractice {
    public static void main(String[] args) {


        String name = "Yasin Tawasulli khan";
        // methods of string are instance methods:
        char ch = name.charAt(2);
        System.out.println(ch);
        System.out.println(name.length());// find numbers of characters in te string

        System.out.println("----------");

        char lastChar = name.charAt(name.length() - 1);// finding last char of given string
        System.out.println(lastChar);

        System.out.println("---------------");

        String school = "Cydeo school";
        int index1 = school.indexOf('e');
        System.out.println(index1);

        System.out.println("-------------");

        String sectences = "today is Thursday and tomorrow is Friday";
        sectences = sectences.replaceFirst("Thursday", "Sunday");


        System.out.println("=-------------------");

        String email = "cydeo_school@gmail.com";
        int beginningIndex = email.indexOf('@') + 1;  // method of finding substring with indexFf and lastIndexOf methods
        int endingIndex = email.lastIndexOf('.');
        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println("-------------=---------");
        String s2= "I study at Cydeo School";
        String schoolName= s2.substring(s2.indexOf('C'));
        System.out.println(schoolName);

        System.out.println("------------------");

        String a1= "dog";
        String a2= "DOG";
        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));

        System.out.println("-------------");

        String str= "Java is my favorite programming language";
        System.out.println(str.equals("java"));
        System.out.println(str.contains("Java"));


        String happy= " happy new year";
        int result= happy.length();
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        boolean sentense= sentence.contains(word);
        System.out.println(sentence);

    }
}