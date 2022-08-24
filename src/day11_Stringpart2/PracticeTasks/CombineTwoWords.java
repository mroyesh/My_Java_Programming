package day11_Stringpart2.PracticeTasks;

import java.beans.PropertyEditorSupport;
import java.io.FilterOutputStream;
import java.util.Scanner;

public class CombineTwoWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word");
        String firstWord = input.nextLine();
        System.out.println("enter the second word");
        String secondWord= input.nextLine();

        if(firstWord.charAt(firstWord.length()-1)==secondWord.charAt(0)){
            String result= firstWord+secondWord.substring(1);
        }else{
            System.out.println(firstWord+ " "+ secondWord);
        }
        }
    }

