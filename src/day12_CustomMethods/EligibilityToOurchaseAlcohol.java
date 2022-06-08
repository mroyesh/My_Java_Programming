package day12_CustomMethods;

public class EligibilityToOurchaseAlcohol {
    public static void main(String[] args) {

        OddEvenZero(0);

        purchaseAlcohol(103);

    }

    public static void purchaseAlcohol(int number) {
        if ( number >= 0 && number <= 100 ) {
            if ( number >= 21 ) {
                System.out.println("you are eligibeto buy alcohol");
            } else {
                System.out.println("you are not eligible to purchase alcohol");
            }
        } else {
            System.out.println("Not valid entry");

        }
    }

    public static void OddEvenZero(int number){
        if(number%2==0 &&number != 0){
            System.out.println("number is even");
        }else if(number==0){
            System.out.println("number is zero");
        }else{
            System.out.println("number is odd");
        }
    }


    }
