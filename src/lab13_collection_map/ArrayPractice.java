package lab13_collection_map;

import day33_abstraction.EmployeeTask.Employee;

public class ArrayPractice {
    public static void main(String[] args) {
        int[]numbers= new int[5];
        numbers[0]= 10;
        numbers[1]=20;
        numbers[2]= 30;
        numbers[3]= 40;
        numbers[4]=50;
        numbers= new int[7];

        System.out.println(numbers);

        System.out.println("--------------------------------------");

        int[] scores= {10, 20, 30, 40, 50};// two ways of creating arrays
        int[] scores2= new int[]{10, 20, 30, 40, 50};

        System.out.println("-----------------------------------------");

        int[][] arr2D= {{},{}};
        int [][][]arr3D= {{{}}, {{}}};

        System.out.println("-----------------------------------------");



        }
}
