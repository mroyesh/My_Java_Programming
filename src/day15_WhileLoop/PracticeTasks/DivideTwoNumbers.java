package day15_WhileLoop.PracticeTasks;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a= 13;
        int b=6;
        int result=0;
        while (a>=b){
            a-=b;
            result++;
        }
        System.out.println("the result is equals to: "+result+" with reminder of "+ a);
    }
}
