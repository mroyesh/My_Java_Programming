package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        String[]students= new String[5];
        students[0]="Gulchen";
        students[4]="Asil";
        students[2]="Sumaya";
        students[students.length-2]="Ali";;
        students[1]="Hadi";
        System.out.println(Arrays.toString(students));
        students[4]="yasin";
        System.out.println(Arrays.toString(students));


        System.out.println("-----------------------------");

        for (int i = students.length-1; i >=0; i--) {
            System.out.println(students[i]);


            System.out.println("--------------------------");

            //for (int j = 0; j < students.length; j++) {//   arrays name +fori.

            //for (int i1 = students.length - 1; i1 >= 0; i1--) {// arrays name + forr.

            }

            }

}
