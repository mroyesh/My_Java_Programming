package day06_IfStatement;

import day15_WhileLoop.BreakStatement;

public class Tasks {
    public static void main(String[] args) {
       /* int a = 10, b = 15, c = 20;
        boolean aIsMedian = (a > b && a < c || a < b && a > c);

        boolean bIsMedian = (b > a && b < c || b < a && b > c);

        boolean cIsMedian = !bIsMedian && !aIsMedian;

        if(aIsMedian){
            System.out.println(a+ " is median number");
        }
        if(bIsMedian){
            System.out.println(b+ " is median number");
        }
        if(cIsMedian){
            System.out.println(c+ " is median number");
        }
    }
}



/*

1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers
		Ex:
                a = 10, b= 15, c = 20;
            Output:
                15 is the median number
 */

       /* int n=9;
        String result= "";
        if(n==0){
            result="zero";
        }
        if(n==1){
            result="One";
        }
        if(n==2){
            result="Two";
        }
        if(n==3){
            result="Three";
        }
        if(n==4) {
            result = "Four";
        }
        if(n==5) {
            result = "Five";
        }
        if(n==6) {
            result = "Six";
        }
        if(n==7) {
            result = "Seven";
        }
        if(n==8) {
            result = "Eight";
        }
        if(n==9) {
            result = "Nine";
        }
        System.out.println(result);

    }
}

/*
 Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */

       /* double n1= 10;
        double n2= 20;
        char operator= '*';
        double result= 0;
        if(operator=='-'){
            result= n1-n2;
        }
        if(operator=='+'){
            result= n1+n2;
        }
        if(operator=='*'){
            result= n1*n2;
        }
        if(operator=='/'){
            result= n1/n2;
        }
        System.out.println("result = " + result);



    }
}
/*
3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */

        /*int number = 4;
        String language = "";
        if ( number == 1 ) {
            language = "Hello, thank for your call";
        }
        if ( number == 2 ) {
            language = "Hola, gracias para llamar";
        }
        if ( number == 3 ) {
            language = "Merhaba, aradiginiz icin tesekkurler";
        }
        if ( number == 4 ) {
            language = "Privet, spasibo za vash zvonok";
        }
        if ( number == 5 ) {
            language = "Merci ,pour votre appel";
        }
        System.out.println(language);


    }
}
/*
4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement
 */

        /*char ch = '@';
        String result = "";

        boolean isDigit = (ch >= '0' && ch <= '9');
        boolean isAlphabet = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
        boolean isSpecialChar = !isDigit && !isAlphabet;
        if(isDigit){
            result="Digit";
        }
        if(isAlphabet){
            result="Alphabet";
        }
        if(isSpecialChar){
            result=" Special Character";
        }
        System.out.println(result);


    }
}
/*
5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */


        /* int age = 55;
        String result = "";
        if ( age >= 1 && age <= 2 ) {
            result = "infant";
        }
        if ( age >= 3 && age <= 5 ) {
            result = "Toddler";
        }
        if ( age >= 6 && age <= 9 ) {
            result = "kid";
        }
        if ( age >= 10 && age <= 12 ) {
            result = "Pre-Teen";
        }
        if ( age >= 13 && age <= 17 ) {
            result = "Teenager";
        }
        if ( age >= 18 && age <= 20 ) {
            result = "Young Adult";
        }
        if ( age >= 21 && age <= 39 ) {
            result = "Adult";
        }
        if ( age >= 40 && age <= 49 ) {
            result = "Young-Middle aged adult";
        }
        if ( age >= 50 && age <= 59 ) {
            result = "Middle aged adult";
        }
        System.out.println(result);

    }
}

/*
6. Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement
 */


        /*int n1 = 10;
        int n2 = 12;
        int n3 = 10;
        String result = "";
        if ( n1 == n2 && n1 == n3 ) {
            result = "All equal";
        }
        if ( n1 == n2 ) {
            result = "n1 & n2 are equal";
        }
        if ( n1 == n3 ) {
            result = "n1 & n3 are equal";
        }
        if ( n2 == n3 ) {
            result = "n2 & n3 are equal";
        }
        if ( n1 != n2 && n1 != n3 ) {
            result ="None of them are equal";
        }
        System.out.println(result);

    }
}
/*
7. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
 */

        /*int gasLevel= 60;
        String warningMsg="";
        if(gasLevel>=90){
            warningMsg="Your tank is full";
        }
        if(gasLevel>=80 && gasLevel<90){
            warningMsg="Don't go too far";
        }
        if(gasLevel>=70 && gasLevel<80){
            warningMsg="Still okay";
        }
        if(gasLevel>=60 && gasLevel<70){
            warningMsg="Start to head back";
        }
        if(gasLevel>=50 && gasLevel<60){
            warningMsg="Be careful now you at at 50%";
        }
        System.out.println(warningMsg);

    }
}
/*

8. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

 */

        /*double salary = 120000;
        boolean isMarried = true;
        double taxRate = 0;
        if ( salary >= 130000 ) {
            taxRate = 0.35;
        }
        if ( salary >= 100000 && salary < 130000 ) {
            taxRate = 0.3;
        }
        if ( salary >= 80000 && salary < 99000 ) {
            taxRate = 0.25;
        }
        if ( salary <= 79000 ) {
            taxRate = 0.2;
        }
        if ( isMarried ) {
            taxRate -= 0.05;
        }
        double salaryAfterTax= salary-( salary*taxRate);
        System.out.println(salaryAfterTax);


    }
}

/*

9. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */

    }
}

