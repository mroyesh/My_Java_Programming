package day19_array;
import java.util.Arrays;
public class arraysIntro {
    public static void main(String[] args) {
        int[]scores= new int[5];
        scores[2]=78;
        scores[0]=85;
        scores[3]=78;
        scores[1]=75;
        scores[4]=95;

        //scores=new int[10];
        System.out.println( Arrays.toString(scores));
        System.out.println(scores[2]);

        //for (int i = 0; i <5 ; i++) {
        for (int i = 0; i <scores.length ; i++) {
            System.out.println(scores[i]);
        }
        System.out.println(scores[scores.length-1]);// this is the last index of Arrays.


        }



    }


