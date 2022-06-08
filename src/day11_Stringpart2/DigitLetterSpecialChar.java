package day11_Stringpart2;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        //Scanner str = new Scanner(System.in).nextLine();
        String str ="happy new year";
        if ( str.length() > 1 ){ // if string has at least one character
            char f = str.charAt(0);// the first character is string
            System.out.println("the character is:" + f);
            // in this case we are finding if string starts with what??
            if (f >='0' && f<='9'){
                System.out.println("fist character is degit");  //
            }else if (f >='A'&&f <= 'Z'){
                System.out.println("fist charactorer is uppercase letter");
            }else if (f>='a'&&f <='z'){
                System.out.println("fist char is lowercase letter");

            }else {
                System.out.println("First character is special character");
            }


        }else{
            System.err.println("String is empty");

        }


        System.err.println(str.length());
    }
}
