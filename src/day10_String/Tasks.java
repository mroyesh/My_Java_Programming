package day10_String;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        String website= "www.cydeo.com";
        boolean isValid= website.startsWith("www") && website.endsWith(".com") || website.endsWith("edu")|| website.endsWith(".co");
        if(isValid){
            System.out.println("This is a valid website");
        }else {
            System.out.println("not valid");
        }
        System.out.println(isValid);

        /*String website = "www.cydeo.com";
        boolean isValid = (website.startsWith("www") && website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov"));
        if ( isValid ) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid website");
        }
    }
    }
/*
1. Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

 }
 }
         */

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter the word");
        String word= input.nextLine();
        //String word= "xcodex";// if we remove scanner also can solve this question
        if(word.charAt(0)=='x'){
            word= word.replace("x", "a");
        }
        System.out.println(word);
    }
}
/*

2. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */

       /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();
        if ( word.contains("x") ) {
            word = word.replaceAll("x", "a").replaceAll("X", "a");
            System.out.println(word);

        }
3. Creat a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
    */


        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter the word");
        String word= input.nextLine();

        if(word.endsWith("ly")){
            System.out.println("Really");
        }else {
            System.out.println("Never mind");
        }


    }
}

/*
4. Create a class named ReallyNeverMind. Ask the user to enter a word.
 if the word ends with "ly", print "really???" ,
   otherwise, print "never mind"

 */

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter your first word");
        String w1= input.nextLine();
        System.out.println("Enter your second word");
        String w2= input.nextLine();
        String w3= w1.substring(1)+w2.substring(1);
        System.out.println(w3);
    }
}
/*
5. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1= input.nextLine();
        System.out.println("Enter your second word");
        String word2= input.nextLine();
        input.close();

        String result= word1+word2.substring(1);
        System.out.println(result);
    }
}
/*

6. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter your fist name");
        String FName= input.next();
        System.out.println("Enter your last name");
        String LName= input.next();
        String result= FName.substring(0,1).toUpperCase()+FName.substring(1)+" "+LName.substring(0,1).toUpperCase()+LName.substring(1);

        System.out.println(result);

    }
}
/*

7. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */

        /*Scanner input= new Scanner(System.in);
        System.out.println("Enter the email");
        String email= input.nextLine();
        input.close();

        String fName= email.substring(0, email.indexOf('_'));
        String lName= email.substring(email.indexOf('_')+1, email.indexOf('@'));
        String rest= email.substring(email.indexOf('@'));

        String newEmail= lName+"_"+fName+rest;
        System.out.println(newEmail);*/
       /* /*String email="royesh_yasin@gmail.com";
        String fn= email.substring(0, email.indexOf('_'));
        String ln= email.substring(email.indexOf('_')+1, email.indexOf('@'));
        String rest= email.substring(email.indexOf('@'));

        String nEmail= ln+"_"+fn+rest;
        System.out.println(nEmail);


    }
}

/*Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Saperated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */


       /* String email2= "yasin_royesh@gmail.com";
        String fn= email2.substring(0,1).toUpperCase()+email2.substring(1, email2.indexOf('_'));
        String ln= email2.substring(email2.indexOf('_')+1, email2.indexOf('_')+2).toUpperCase()+email2.substring(email2.indexOf('_')+2,email2.indexOf('@'));
        String domain= email2.substring(email2.indexOf('@')+1,email2.indexOf('.'));

        System.out.println("First name = " + fn);
        System.out.println("last name = "+ ln);
        System.out.println("Domain = "+domain);
    }
}
/*
 Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */


        /*Scanner input = new Scanner(System.in);
        System.out.println("Split or no split(yes/no");
        String yesOrNo = input.nextLine().toLowerCase();

        System.out.println("Enter number of people");
        int numberOfPeople = input.nextInt();
        System.out.println("Enter amount of check");
        double checkAmount = input.nextDouble();
        System.out.println("Enter service quality, excellent/great/good/fair/poor");
        String serviceQuality = input.next().toLowerCase();

        double tapeRate = (serviceQuality.equals("excellent") ? 0.25 : (serviceQuality.equals("great") ? 0.2 :
                (serviceQuality.equals("good") ? 0.15 : (serviceQuality.equals("fair") ? 0.1 : 0.05))));

        double totalTape = checkAmount * tapeRate;

        System.out.println("number of people entered = " + numberOfPeople);
        System.out.println("Total to pay = " + checkAmount);
        System.out.println("Total tape = " + totalTape);
        if ( yesOrNo.equals("yes") ) {
            System.out.println("Total per person =  " + checkAmount / numberOfPeople);
            System.out.println("Tip per person = " + totalTape / numberOfPeople);
        }
        input.close();


    }


    /*
    10. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
     */



    }
}

