package day12_Tests;

public class eligibleToVote {
    public static void main(String[] args) {

        eligibleToVoteinElection(43, true);
    }
    private static void eligibleToVoteinElection(int age,boolean isAmerican){
        if(age>=21&& isAmerican ){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }

    }
}
