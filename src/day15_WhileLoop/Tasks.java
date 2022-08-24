package day15_WhileLoop;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String yesNo = input.nextLine().toLowerCase();
        while ( ! (yesNo.equals("yes") || yesNo.equals("no"))) {
            System.err.println("Invalid, try again");
            System.out.println("Will you marry me?");
            yesNo = input.nextLine().toLowerCase();
        }
        if(yesNo.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }

    }
    /*
    1.  Create a class named Marriage proposal and Write a program for the
     marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter"
    and repeat it until the user enters either yes or no
     */

        /*Scanner input= new Scanner(System.in);

        int countPositive=0;
        int countNegative=0;
        System.out.println("Enter five numbers");
        for( int i=0; i<5; i++){
        int num= input.nextInt();

            if(num>0){
                countPositive++;
            }else {
                countNegative++;
            }
        }
        System.out.println(countPositive+", "+countNegative);

/*
2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter the String");
        String str= input.nextLine();
        System.out.println("Enter the char");
        char ch= input.next().charAt(0);
        int frequency=0;
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)==ch){
                frequency++;
            }
        }
        System.out.println(frequency);


        /*
        Create a class named FrequencyOfChar and Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
         */

       /* int n1 = 20;
        int n2 = 10;
        int result = 0;
        while (n1 >= n2) {
            n1 -= n2;
            result++;
        }
        System.out.println(result + " with reminder of " + n1);

        /*
        Create a class named DivideTwoNumbers and Write a
        program that can divide two positive numbers without using /
        (division) and * (multiplication) operators.
         */


        /*Scanner input = new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("Enter the number");
            int num= input.nextInt();
            if(num>0){
                sum+=num;
            }
            if(num<0){
                break;
            }

        }
        System.out.println(sum);
        /*
        Create a class named UntilNegative and Write a program that
        calculates the sum of numbers entered by the user until user enters a negative number.

         */


        /*int number = 200;
        String by15 = "";
        String by5 = "";
        String by3 = "";
        for (int i = 1; i <= number; i++) {
            if ( i % 15 == 0 ) {
                by15 += i+ " ";
            }
            if ( i % 5 == 0 && i % 15 != 0 ) {
                by5 += i + " ";
            }
            if ( i % 3 == 0 && i % 15 != 0 ) {
                by3 += i + " ";

            }
        }
        System.out.println("by15 = " + by15);
        System.out.println("by5 = " + by5);
        System.out.println("by3 = " + by3);

    }
}
         */

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter your userName");
        String userName = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();
        while (!(userName.equals("Cydeo") && password.equals("Cydeo123"))) {
            System.err.println("Invalid log in info, try again");
            System.out.println("Enter your userName");
            userName = input.nextLine();
            System.out.println("Enter password");
            password = input.nextLine();
        }
        if(userName.equals("Cydeo")&& password.equals("Cydeo123")){
            System.out.println("you are logged in");
        }

         */


        /*Scanner input= new Scanner(System.in);

        System.out.println("Enter your name");
        String name= input.nextLine();

        System.out.println("Enter your gender");
        String gender= input.next().toLowerCase();

        while( !(gender.equals("male")||gender.equals("female")) ){
            System.err.println("Invalid Entry, please re-enter your gender:");
            gender = input.next().toLowerCase();
        }
        System.out.println("Are you married? yes or no");
        String married= input.next().toLowerCase();

        while( !(married.equals("yes")||married.equals("no")) ){
            System.err.println("Invalid Entry, please re-enter! Are you married?");
            married = input.next().toLowerCase();
        }
        System.out.println("enter your age");
        int age= input.nextInt();

        while (age<0|| age>120){
            System.err.println("Invalid age");
            System.out.println("enter your age");
            age= input.nextInt();
        }
        System.out.println("how many mile do you drive?");
        int miles= input.nextInt();
        input.nextLine();

        while (miles<5){
            System.err.println("Invalid miles");
            System.out.println("how many mile do you drive?");
            miles= input.nextInt();
        }
        System.out.println("have you want full coverage or liability coverage?");
        String insuranceType= input.next().toLowerCase();
        while ( !(insuranceType.equals("full coverage")|| insuranceType.equals("liability"))){
            System.err.println("Invalid insurance type, enter your insurance type please");
            insuranceType= input.nextLine().toLowerCase();
        }
        System.out.println("Have you had accident in the past five years? yes or no");
        String hasAccident= input.next().toLowerCase();

        while (!(hasAccident.equals("yes")|| hasAccident.equals("no"))){
            System.err.println("Invalid entry");
            System.out.println("Have you had accident in the past five years? yes or no");
            hasAccident= input.next().toLowerCase();
        }
        System.out.println("does your can have anti-theft device? yes or no ");
        String hasAntiTheft= input.next().toLowerCase();

        while (!(hasAntiTheft.equals("yes")|| hasAntiTheft.equals("no"))){
            System.err.println("Invalid answer");
            System.out.println("does your can have anti-theft device? yes or no ");
            hasAntiTheft= input.next().toLowerCase();
        }
        int price=0;
        if(insuranceType.equals("liability")){
        if( age< 25){
            price+=90;
        }else {
            price += 50;
        }
        if(miles<=10){
            price+=10;
        }else if(miles>10&& miles<=50){
            price+=30;
        }else {
            price+=50;
        }
        }else {
            if(age<25){
                price+=160;
            }else {
                price+=120;
            }
            if(miles<=10){
                price+=20;
            } else if ( miles>10&&  miles<=50 ) {
                price+=50;
            }else {
                price+=70;
            }
        }

        if(hasAntiTheft.equals("yes")){
            price-=0.05;
        }
        if(hasAccident.equals("yes")||hasAccident.equals("no")){
            price+=0.015;

        }
        if(hasAccident.equals("no")){
           price-=0.1;
        }
        if(married.equals("yes")){
            price-=0.05;
        }

        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("married = " + married);
        System.out.println("hasAntiTheft = " + hasAntiTheft);
        System.out.println("hasAccident = " + hasAccident);
        System.out.println("insuranceType = " + insuranceType);
        System.out.println("your cost will be: $"+price+ " per month");
        input.close();
/*
10. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount
 */



        /*Scanner input = new Scanner(System.in);
        int total = 0;


        System.out.println("Which room would you like to select?");
        System.out.println("\t\tKing Bed == $120");
        System.out.println("\t\tQueen Bed == $100");
        System.out.println("\t\tSingle Bed == $80");

        String word = input.nextLine().toLowerCase();

        while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
            System.out.println("Invalid Entry, Please Re-Enter");
            word = input.nextLine().toLowerCase();
        } // to make sure user selected either the king bed, or queen bed or single bed

        total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

        System.out.println("Your total price is: $" + total);

        input.close();

    }

}

/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$
            the program should be able to display the room he/she reserved and total price of the room.
            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
*/


        /*String str = "aabcccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)  ){
                unique += each;
            }

        }


        System.out.println(unique);

    }

}

/*
Create a class called UniqueCharacters, Write a program that can return the unique characters from a String
	            Ex:
	                input:
	                    AABCCD
	                output:
	                    BD
	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */











    }
}