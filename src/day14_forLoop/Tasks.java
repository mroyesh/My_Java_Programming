package day14_forLoop;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {


        /*for (int i = 1; i <= 8; i++) {
            System.out.println("* * * * * * * *");

/*
1. Use a loop to print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */

       /* for (int i = 0; i <= 100; i++) {
            if ( i % 15 == 0 ) {
                System.out.print("FINRA ");
            } else if ( i % 5 == 0 ) {
                System.out.print("RA ");
            } else if ( i % 3 == 0 ) {
                System.out.print("FIN ");
            } else {
                System.out.print(i + " ");
            }
        /*

2. Write a method which prints out the numbers from 1 to 100 but
for numbers which are a multiple of both 3 and 5, print "FINRA"
instead of the number,  for numbers which are a multiple of 3, print "FIN"
 instead of the number and for numbers which are a multiple of 5, print "RA"
 instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN

        }*/

        /*int sum=0;
        for(int i=0; i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("-------------------------------");

        int sum1=0;
        for(int j=0; j<=50;j++){
            sum1+=j;
        }
        System.out.println("Sum of 1~50 is equal to: "+sum1);




/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */


        /*int number= new Scanner(System.in).nextInt();
        int factorial=1;
        for(int i=1; i<=number; i++){
            factorial*=i;
        }
        System.out.println(factorial);
        /*
         Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */


        /*String str = "ABCabc123!@#$";
        String letters = "";
        String digits = "";
        String specialChar = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ( ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ) {
                letters += ch;

            } else if ( ch >= '0' && ch <= '9' ) {
                digits += ch;

            } else {
                if ( ch != ' ' ) ;
                specialChar += ch;
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);
    }



        /*
        5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */

        /*String str1 = "A1B2C3";
        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch=str1.charAt(i);
            if ( ch >= '0' && ch <= '9' ) {
                sum += ch-48;


            }


        }
        System.out.println(sum);
    }
    }

         */

       /* String str= "hi";
        String result= "";
        for(int i=str.length()-1;i>=0;i-- ){
            result+=str.charAt(i);
        }
        boolean isPalindrome= str.equalsIgnoreCase(result);
        System.out.println(isPalindrome);
        /*
         Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true

				input:
					Anna

				output:
					true

        */



    }
}