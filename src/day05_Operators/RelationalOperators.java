package day05_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
       /* double salary = 60000;

        int creditScore = 650;
        int age = 42;

        boolean eligibleForLoan =   salary >= 30000 && creditScore >= 650 && age >= 18;
        //  true        &&     true            &&   true

        System.out.println(eligibleForLoan);

        System.out.println("-----------------------------------------------------");

        int age = 23;
        String country = "USA";

        boolean eligibleToVote = age >= 18  && country == "USA";

       //                          true    &&  false

        System.out.println("The person is eligible to vote:  " + eligibleToVote);

        System.out.println("-----------------------------------------------------");

        String country = "Mexico";
        boolean isANativeEnglishSpeaker = country == "UK" || country== " USA" || country == "Australia";
        System.out.println(isANativeEnglishSpeaker);*/


        int score = 65;
        boolean passed = score >=60;
        boolean failed = !passed;
        System.out.println(passed);
        String country = "Afghanistan";

        boolean nativeEnglishSpeaker =  country == "Canada" || country == "USA" || country == " UK" || country == "Australia";
        //                                false             ||       false      ||   false          ||   true

        System.out.println("nativeEnglishSpeaker = " + nativeEnglishSpeaker);

        System.out.println("-----------------------------------------------------");

        String answer = "maybe";

        boolean validAnswer =  answer == "yes" || answer == "no";

        System.out.println(validAnswer);

        System.out.println("-----------------------------------------------------");

       char grade = 'A';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';

        System.out.println(passedTheExam);

        System.out.println("-----------------------------------------------------");

        System.out.println(!true);

        /*String a = "yes";

        boolean x =  a == "yes"; // true
        boolean no = !x; // false

        System.out.println("x = " + x);
        System.out.println("no = " + no);

        System.out.println("-----------------------------------------------------");

        int score1 = 65;
        boolean acceptance = score1 >= 76;
        boolean reject = !acceptance;
        System.out.println(acceptance);
        System.out.println(reject);

        System.out.println("-----------------------------------------------------");

        System.out.println(  true == !false && false  == !true && true != !true  );*/
        //                    true          &&     true        &&   true



    }
}
