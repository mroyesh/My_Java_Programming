package day20_forEachLoop;

import java.util.Arrays;
import Utilities.ArraysUtility;
public class MargeTwoArrays {
    public static void main(String[] args) {


        int[]arr1= {1,2,3,4};
        int[]arr2= {5,6,7};

       /* int[]ar1= Arrays.copyOf(arr1, arr1.length+arr2.length);

        for (int i = 0,j=0 ;i < arr2.length; i++,j++) {
            ar1[j]=arr2[i];
            System.out.println(Arrays.toString(ar1));
        }*/
        int []result= new int[arr1.length+arr2.length];//
        int k=0;// for third arrays index number
        for (int i = 0; i < arr1.length; i++,k++) {
            result[k]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) {
            result[k]=arr2[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("------------------------------");


         int[]a1= {10, 20, 30, 40};
         int[]a2={50,60,70};
         int[] arr3=new int[a1.length+a2.length];

         int j=0;
        for (int i = 0; i < a1.length; i++,j++) {
            arr3[j]=a1[i];
        }
        for (int i = 0; i < a2.length; i++,j++) {
            arr3[j]=a2[i];

        }
        //int[]a3=ArraysUtility.merge(a1, a2);
        System.out.println(Arrays.toString(arr3));


        System.out.println("-------------------");

        double[]b1= {2.0, 3.4,3.5};
        double[]b2={2.5,5.5, 6.7};
        double[]b3= ArraysUtility.merge(b1, b2);
        System.out.println(Arrays.toString(b3));

        System.out.println("---------------------");

        char[]ch1={'A','B','C','D','E'};
        char[]ch2={'F','G','H','I', 'K'};
        char[]ch3= ArraysUtility.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));


        System.out.println("-----------------------");

        String[]str1= {"java", "python","C++"};
        String[]str2={"javascript", "C#"};
        String [] str3=ArraysUtility.merge(str1,str2);
        System.out.println(Arrays.toString(str3));


    }
}
