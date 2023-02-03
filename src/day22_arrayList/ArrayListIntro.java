package day22_arrayList;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        int [] array= new int[5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        int[] array5={10,20,40,50,30};
        Arrays.sort(array5);

        System.out.println(Arrays.equals(array5,array));


        int [] array1= Arrays.copyOfRange(array,2,4 );

        int [] array2= Arrays.copyOf(array,3);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1));

        System.out.println("-------==================");

        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------------");


        ArrayList<Integer>list= new ArrayList<Integer>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(12);
        System.out.println(list);
        System.out.println("-------------------------------");
        ArrayList<Integer> numbers= new ArrayList<>();
        System.out.println("numbers = " + numbers);
        System.out.println(numbers.size());
        numbers.add(10);
        System.out.println(numbers);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(70);
        numbers.add(80);
        numbers.add(3, 100);
        numbers.add(5, 60);

        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(nums.isEmpty());
        nums.addAll(numbers);
        System.out.println(nums);
        ArrayList<String> str= new ArrayList<>(Arrays.asList("Java","Python","C#","JavaScript" ));

        str.remove("Python");
        System.out.println(str);
        str.set(0,"Ruby");
        System.out.println(str);

        ArrayList<Integer>n2= new ArrayList<>(Arrays.asList(25,10,15,20,25));
        System.out.println(n2.indexOf(20));

        System.out.println( n2.lastIndexOf(25));
        System.out.println(n2.indexOf(25));
        System.out.println( n2.equals(str));

        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''");


        System.out.println( str.contains("Java"));

        nums.clear();
        System.out.println(nums);



        System.out.println(numbers);
        System.out.println( numbers.size());
        System.out.println("------------------------------");

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) +" ");

        }
        System.out.println();

        System.out.println("--------------'''''''--------------------");

        for (Integer each : numbers) {
            System.out.print(each+ " ");
        }
    }
}
