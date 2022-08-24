package day19_array.PracticeTasks;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {


        /* int[] num={100,200, 120, 60,50,-200,-20,1000};


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


        /*for (int i = 1; i < num.length; i++) {// assume that the first element is max
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

         */


        /*String[] classmates = new String[10];
        classmates[0] = "Jawid Karimi";
        classmates[1] = "Diana Happy";
        classmates[2] = "JAlin Adili";
        classmates[3] = "Aziz Adina";
        classmates[4] = "Yasin Tawasulli";
        classmates[5] = "Nazgul Nazari";
        classmates[6] = "Khashayar Shayesta";
        classmates[7] = "Ghadir Ibrahimi";
        classmates[8] = "Ali Karimi";
        for (int i = 0; i <= classmates.length; i++) {
            try {
                String initial = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ") + 1);
                System.out.println(initial);
            }catch (NullPointerException e){
                e.printStackTrace();
            }

        }*/


        /*String[] students={"Jawid Karimi","Diana Happy","Ali Adili", "Aziz Adina", "Yasin Tawasulli",
        "Nazgul Nazari", "Khashayar Shayesta", "Ghadir Ibrahimi", "Ali Karimi"};

        for (int i = 0; i < students.length; i++) {
            String names= students[i];
            String reverse= "";
            for(int j=names.length()-1;j>=0; j-- ){
                reverse+=names.charAt(j);
            }
             System.out.println(reverse);

        }

        /*


        2. create string array, and store the names of your  classmates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */

        /*String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};


        int itemIndexOfGloves = -1;
        boolean hasIpad = false;
        String report = "";
        for (int i = 0; i < items.length; i++) {
        String itemName = items[i];
        double itemPrice = prices[i];
        int itemID = itemIDs[i];
        if ( itemName.equals("Gloves") ) {
                itemIndexOfGloves = i;
            }
        if ( itemName.equals("iPad") ) {
                hasIpad = true;
            }
        report += itemName + "-" + itemPrice + "-" + itemID;

        }
        System.out.println("Index of Gloves= " + itemIndexOfGloves);
        System.out.println("has Ipad= " + hasIpad);
        System.out.println(report);

        /*
        . Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
         */


        /*String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i < grades.length; i++) {
            int score = scores[i];
            if ( score >= 90 ) {
                grades[i] = 'A';
            } else if ( score >=80 ) {
                grades[i] = 'B';
            } else if ( score >= 70 ) {
                grades[i] = 'C';
            } else if ( score > 60 ) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
            System.out.println(names[i] + " 's score is " + score + ", and grade is " + grades[i]);

        }

        /*

4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
         */

        /*int[] arr= {1,2,3,4,5};
        int[]reverseArr= new int[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            reverseArr[j]=arr[i];
        }
        System.out.println(Arrays.toString(reverseArr));

        /*
        6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

         */

        /*int[]array = {10, 0, 5, 0, 1, 0};
        int [] result= new int[array.length];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] !=0){
                result[j++]=array[i];
        }
        }
        System.out.println(Arrays.toString(result));

        /*
        7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
         */


        /*int[] arr1= {1,2,3,4,5};
        int[]arr2= {4,5,6,7,8};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }

            }

        }

        /*

8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
         */





    }
}