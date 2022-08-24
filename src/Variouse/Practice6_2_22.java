package Variouse;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6_2_22 {
    public static void main(String[] args) {

        String []arr= {"a", "foo", "bar", "foo", "bla"};
        int countApperance=0;
        for (String word : arr) {
            if(word.equals("foo")){
                countApperance++;
            }
        }
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        //WRITE YOUR CODE HERE
        if(word.equals("dumb")){
           word= word.replace("dumb", "cool");
            System.out.println(word);

    }
}






  }
















