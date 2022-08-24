package day09_Scanner;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {


        /*Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int number = input.nextInt();
        input.close();
        String result = (number < 3) ? "Live with less than 3 people" : (number >= 3 && number <= 6) ?
                "Live with 3 - 6 people" : "Live with more than 6 people";
        System.out.println(result);
    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"


 */

        /*Scanner input= new Scanner(System.in);

        System.out.println("enter the circle radius");
        double radius= input.nextDouble();
        input.close();
        double area= radius*radius*Math.PI;

        double parameter=2*Math.PI*radius;

        System.out.println("Area of the circle= "+area);

        System.out.println("Parameter of the circle= "+ parameter);
        System.out.println(radius);





    }
}
/*

2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter your score");
        int score= input.nextInt();
        input.close();

        String result="Invalid Score";
        if (score>=0&&score<=100){
            if(score>=90){
                result="A";
            } else if ( score>=80 ) {
                result = "B";
            }} else if (score >= 70) {
            result = "C";
            } else if (score >= 60) {
            result = "D";
        } else {
            result = "F";
        }
        System.out.println(result);

}
    }

/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter your speed");
        int speedLimit=55;
        int speed= input.nextInt();
        input.close();
        if(speed>speedLimit) {
        }
        System.out.println("you are driving " + (speed - speedLimit) + " mph over speed, slow down");

    }
}
/*
4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!
         */


        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter amount in cents");
        int amount= input.nextInt();
        int dollars= amount/100;
        int cents= amount%100;
        System.out.println(amount+ " cents equals to "+ dollars+ " dollars and "+ cents+ " cents");
    }
}

         /*
        5. Create a class named CentsToDollars, write a program that can convert cents to dollars
        if there is any remainder include them in the result as cents
        Ex:
        Enter cents
        225

        output:
        225 cents equal to: 2 dollars and 25 cents
*/

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter the product name");
        String productName= input.nextLine();
        System.out.println("Enter the price");
        double price= input.nextDouble();
        System.out.println("Enter quantity");
        int quantity= input.nextInt();
        input.nextLine();
        System.out.println("Enter your name");
        String yourName= input.nextLine();

        System.out.println(yourName+", your order for "+ quantity +" "+ productName+ " has been placed. your total is $"+ price*quantity);
    }
}
/*

7. Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of shares and price ");
        int shares = input.nextInt();
        double price = input.nextDouble();
        if ( shares >= 2000 && price > 2000 ) {
            System.out.println(" good investment");
        } else {
            System.out.println("Pk, investment");
        }






    }
}
/*
8. Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        double n1= input.nextDouble();
        System.out.println("Enter math operator");
        char mathOperator= input.next().charAt(0);
        System.out.println("Enter second number");
        double n2= input.nextDouble();
        input.close();

        switch (mathOperator){
            case '-':
                System.out.println(n1-n2);
                break;
            case '+':
                System.out.println(n1+n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Invalid operator");
        }


    }
}

/*
Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"

 */

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter your hourly rate");
        double hourlyRate= input.nextDouble();
        System.out.println("How many hours you work every week");
        int hourInWeek= input.nextInt();
        System.out.println("Enter state tax rate");
        double stateTaxRate= input.nextDouble();
        System.out.println("Enter federal tax rate");
        double federalTAxRate= input.nextDouble();

        input.close();

        double salary= hourlyRate* hourInWeek;
        double stateTax= salary*stateTaxRate;
        double federalTax= salary*federalTAxRate;
        double totalTax= stateTax+federalTax;
        double newIncome= salary-totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("newIncome = " + newIncome);


    }
}
/*
10. create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)
         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */





    }
}





