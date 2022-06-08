package day05_Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int age = 23;
        int salary= 80000;
        int cridetScore=700;
        boolean eligibleForLoan= age>=21 && salary>78000&& cridetScore>750;
        System.out.println(eligibleForLoan);


        int score= 50;
        boolean passed = score>60;
        System.out.println(passed);


        /*int age = 45;
        int creditScore = 750;
        double salary = 95000;
        boolean eligibleForLoan = age >=18 && salary >= 55000 && creditScore >= 700;
        System.out.println(eligibleForLoan);
        int age = 27;
        String status = "US resident";
        String background = " not clear";
        boolean eligibleToVote = age >= 18 && status == "US resident" || background == "Clear";
        System.out.println("eligibleToVote = " + eligibleToVote);

        char grade = 'A';
        double height = 5.6;
        boolean eligibleTeServeAsMilitary = grade =='A' && height >=7;
        System.out.println("eligibleTeServeAsMilitary = " + eligibleTeServeAsMilitary);
        String a = "yes";System.out.println("");
        boolean yes = a =="yes";
        boolean agree = !yes;
        System.out.println(a);
        System.out.println("yes = " + yes);
        System.out.println("agree = " + agree);

        /*char grade = 'B';
        double hieght = 6.0;
        boolean acceptanceInMilitary = grade =='B' && hieght >5.6;
        System.out.println(acceptanceInMilitary);
        int creditScore = 800;
        double salary = 190000;
        double jobType = salary;
        boolean beingEligibleToGetLoan = jobType >=60 && salary >=16000 && creditScore >= 750;
        System.out.println(beingEligibleToGetLoan);
        double salary = 23000;
        int creditScore = 700;
        int age = 34;
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 21;
        System.out.println(eligibleForLoan);
        age= 32;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country == "USA";
        country = "Australia";
        boolean nativeEnglishSpeaker = country == "Canada" || country =="USA"
                || country == "UK" || country =="Australia";
        System.out.println("nativeEnglishSpeaker = " + nativeEnglishSpeaker);

        System.out.println("---------------------------");
        String answer = "maybe";
        System.out.println("--------------------------");

        char grade = 'A';
        boolean passedTheExam = grade =='A' || grade =='B' || grade=='C' || grade== 'D';

        System.out.println("------------------------------");
        System.out.println(!true);

        System.out.println( true == !false && false == !true && true != !true);*/






    }
}
