package day13_CustomMethods;

public class ReturnStatement {
    public static void main(String[] args) {
        eligibleToVote(2);

        int result= multiplication(12,12);
        System.out.println(result);


    }

    private static void eligibleToVote(int age) {
        if ( age < 0 || age > 150 ) {
            System.err.println("invalid entry");
            return;
        }
        if ( age >= 18 ) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }


        if ( age < 0 && age > 150 ) {
            System.err.println("invalid age" + age);
            return;// exits the method
            //if the age is invalid then this gets terminated
        }
        if ( age >= 21 ) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println(" you are not eligible to vote");

        }
    }

    private static int multiplication(int n1, int n2) {
        int result = n1 * n1;
        return result; // return the value when exiting the method

    }
}
