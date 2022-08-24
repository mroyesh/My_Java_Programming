package day21_multiDementionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        // String str = "Hello   World   I    Love   Java";

        Scanner input = new Scanner(System.in);
        String str= input.nextLine();
        int countCat=0;
        int countDog=0;
        if(str.contains("cat")) {
            countCat=countCat++;
        }
        if(str.contains("dog")){
            countDog=countDog++;
        }
        if(countCat==countDog){
            System.out.println(true);
        }else {
            System.out.println(false);
        }











    }
}