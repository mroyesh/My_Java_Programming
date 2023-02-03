package day08_ternaries_switch;

public class Tasks {
    public static void main(String[] args) {
        int number= 15;
        String result=(number==1)?"One":(number==2)?"Tow":(number==3)?"Three":
                (number==4)?"Four":(number==5)?"Five":(number==6)?"Six":(number==7)?
                        "Seven":(number==8)?"Eight":(number==9)?"Nine":"Invalid Number";
        System.out.println(result);
    }

/*
1. Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;
			output:
				One
		Note: MUST use ternary
 */

        /*double salary = 50000;
        int creditScore = 780;
        String result = (salary > 60000 &&creditScore>650)?"Loan Approved":"Loan denied";

        System.out.println(result);
    }
}
/*

2. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise, print: "Loan Denied"
              NOTE: MUST USE TERNARY.
 */

        /*int gasLevel=68;
        String result=(gasLevel>=90)?"Your tank is full":(gasLevel>=80&& gasLevel<90)?"Still Ok":
                (gasLevel>=70&& gasLevel<80)?"Don't go to far":"Start to head back";
        System.out.println(result);



    }
}

/*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%
                USE ONE PRINT STATEMENT ONLY
            Solution 1: Must use ternary

 */

       /* int n1 = 10, n2 = 13, n3 = 15;
        String result = (n1 > n2 && n1 > n3)?"n1 is the bigger":(n2>n1&&n2>n3)?"n2 is the bigger":"n3 is the bigger";
        System.out.println(result);

    }
}

/*

6. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3
            if n1 is the biggest output: "n1 is bigger"
            if n2 is the biggest output: "n2 is bigger"
            if n3 is the biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY

 */

        /*int n1=20, n2=10;
        char mathOperator='*';
        switch (mathOperator){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
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

         */
    }



