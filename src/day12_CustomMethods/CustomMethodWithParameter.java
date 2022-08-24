package day12_CustomMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {
        OddOrEven(20);

        OddOrEven(20001);

        OddOrEven(211);
        ifEligibleToBuyAlcohol(34);

    }
        // the method takes an argument number ad varify if the numbe is odd or even
    public static void OddOrEven(int number){
        if(number%2==0){
            System.out.println(number+ " is even number");
        }else{
            System.out.println(number+ " is odd number");
        }

    }
    public static void ifEligibleToBuyAlcohol(int number){
        if(number >=0 &&number<=100){
            if(number>=21){
                System.out.println("you are eligibeto buy alcohol");
            }else{
                System.out.println("you are not eligible to purchase alcohol");
            }
        }else{
            System.out.println("Not valid entry");

        }
    }


}
