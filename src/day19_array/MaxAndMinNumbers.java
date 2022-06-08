package day19_array;
import java.util.Arrays;
public class MaxAndMinNumbers {
    public static void main(String[] args) {

        /*int[] num={100,200, 120, 60,50};
        int max=num[0];
        for (int i = 1; i < num.length; i++) {// assume that the first element is max
            if(num[i]>max){ // compare all the elements of arrays with current max number
                max=num[i];// replace the current max number
            }
        }
        System.out.println("max ="+ max);*/

        System.out.println("-------------------------");

        int[] num = {100, 200, 120, 60, 50};
        int min = num[0];
        for (int i = 1; i < num.length; i++) {// assume that the first element is max
            if ( num[i] < min ) { // compare all the elements of arrays with current max number
                min = num[i];// replace the current max number
            }

        }
        System.out.println("min = "+min);
    }
}
