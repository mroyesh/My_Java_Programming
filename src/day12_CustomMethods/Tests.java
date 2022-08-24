package day12_CustomMethods;

public class Tests {
    public static void main(String[] args) {
        //emailDomain("mroyesh@sdccd.edu");// from emailDomain method

        // capitalization("yASIN", "tAWasulli");// from capitalization method been called

        //monthName(6);// month name method

        // day(7); // days of the week method


        //numberOfDaysInMonth("March");

        //eligibleToVote(140, true); // this is from eligible to vote method

        //salary(45, 40); // this method called from salary method

    }
    /*public static void emailDomain(String email) {
        String domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));
        System.out.println(domain);
    }
}
/*
1. Create a method named emailDomain that can display the domain of the email
        Ex:
        emailDomain("Cydeo@gmail.com")

        output:
        domain: gmail
 */


    /*public static void capitalization(String FName, String LName){
        FName= FName.substring(0,1).toUpperCase()+FName.substring(1).toLowerCase();
        LName= LName.substring(0,1).toUpperCase()+LName.substring(1).toLowerCase();
        System.out.println(FName+" "+ LName);
    }*/


   /* public static void monthName(int month){
        String result= (month==1)?"January":(month==2)?"February":(month==3)?"March":(month==4)?"April":(month==5)?"May":(month==6)?
                "June":(month==7)?"July":(month==8)?"August":(month==9)?"September":(month==10)?
                "October":(month==11)?"November":(month==12)?"January":"Nat valid month";
        System.out.println(result);
    }
}
/*
Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)
        output:
            June
 */

    /*public static void day(int dayNumber){
        String result= (dayNumber==1)?"Monday":(dayNumber==2)?"Tuesday":(dayNumber==3)?"Wednesday":(dayNumber==4)?"Thursday":(dayNumber==5)?"May":(dayNumber==6)?
                "Saturday":(dayNumber==7)?"Sunday":"Invalid day number";
        System.out.println(result);

    }


}
/*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */

    /*public static void numberOfDaysInMonth(String month){
        month= month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();
        switch (month){
            case "February":
                month+=" has"+28+ " days";
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                month+=" has "+31 + " days";
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                month+=" has "+ 30+ " days";
                break;
            default:
                month=" invalid";
        }
    }
    /*
    Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
     */


    /*public static void eligibleToVote(int age, boolean isAmerican) {
        if ( age > 0 && age < 150 ) {
            if ( age >= 18 && isAmerican ) {
                System.out.println("you are eligible to vote");
            } else {
                System.out.println("you are not eligible to vote");
            }
        } else {
            System.out.println("Invalid age");
        }


    }

}
/*

6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
     */

    /* static void salary(double hourlyRate, int weeklyHours) {
        System.out.println("You make $" + hourlyRate + " per hour");
        System.out.println("You work " + weeklyHours + " hours in a week");
        System.out.println("Your gross income is $" + hourlyRate * weeklyHours * 52);
    }


}
/*

7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)
        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */


}

