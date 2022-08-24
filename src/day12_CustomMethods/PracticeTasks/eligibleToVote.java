package day12_CustomMethods.PracticeTasks;

public class eligibleToVote {
    public static void main(String[] args) {

        eligibleToVoteInElection(43, true);
    }

    private static void eligibleToVoteInElection(int age, boolean isAmerican) {
        if ( age >= 21 && isAmerican ) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }

    }
}
