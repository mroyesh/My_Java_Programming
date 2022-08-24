package day22_arrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapTask {
    public static void main(String[] args) {
        int[]arr= {10, 20, 30, 40,50};
        System.out.println(Arrays.toString(swap(arr,2,4)));

        Arrays.toString(swap(arr, 0, 3));

    }
    public static int[] swap(int[] arr, int i, int j){
        int temporary=0;
        for(int k=0; k<arr.length; k++){
            if(i==k){
                temporary=arr[i];
                arr[i]=arr[j];
                arr[j]=temporary;
            }
        }
        return arr;
    }
}
