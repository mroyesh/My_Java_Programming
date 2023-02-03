package day19_array;
import java.util.Arrays;
public class MaxAndMinNumbers {
    public static void main(String[] args) {

        int[] num={100,200, 120, 60,50,-200,-20,1000};

        int max= num[0];
        int min=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max=num[i];
        }
            for (int j = 0; j < num.length; j++) {
                if(num[i]<min ){
                    min=num[i];
                }

            }

        }
        System.out.println(min);
        System.out.println(max);


        System.out.println("--------------------------------");


        for (int i = 1; i < num.length; i++) {// assume that the first element is max
            if(num[i]>max){ // compare all the elements of arrays with current max number
                max=num[i];// replace the current max number
            }
        }
        System.out.println("max ="+ max);

        System.out.println("-------------------------");

        int[] num1 = {100, 200, 120, 60, 50};
        //int min = num[0];
        for (int i = 1; i < num1.length; i++) {// assume that the first element is max
            if ( num1[i] < min ) { // compare all the elements of arrays with current max number
                min = num1[i];// replace the current max number
            }

        }
        System.out.println("min = "+min);
    }
}
