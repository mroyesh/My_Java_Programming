package day20_forEachLoop;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
       String str= "I love javva";
       String[] splt= str.split(" ");
       String result="";
       String reverse="";
        for (int i = 0; i < splt.length; i++) {
            if(i==1){
                for (int j = splt[i].length()-1; j >=0 ; j--) {

                }
            }

        }
        System.out.println("-----------------------------------");


        int[] num= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int odd= 0;
        int even=0;
        for (int each : num) {
            if ( each % 2 == 0 ) {
                even++;
            }else{
                odd++;

            }

        }
        System.out.println("Even number: "+even);
        System.out.println("Odd number: "+odd);

        System.out.println("--------------------------");

        int [] n1={1,2,3,4,5};
        int[]n2= {4,5,6,7,8};
        for (int each : n1) {
            for (int i : n2) {
                if(each==i){
                    System.out.print(each+" ");

            }

        }
            }





    }
}
/*

. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";
            output:
                I evoL Java
 */

