package day11_Stringpart2.PracticeTasks;

import java.util.Scanner;

public class nameOfthe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the word");
        String word= input.nextLine();
       String result=  word.replaceFirst("x","a");
        System.out.println(result);
       // in this way we can replace a letter with another one

        




        /*System.out.println("enter the website");
        String web
        = input.nextLine();
        boolean valid = web.startsWith("www")&& web.endsWith(".co")
                ||web.endsWith(".edu")||web.endsWith(".gov");
        if(valid){
            System.out.println("valid website");
        }else {
            System.out.println("Invalid website");
        }

        System.out.println("Enter the word");
        String input = scn.nextLine();
        String a= input.replace("ly","really?");
        if(input.endsWith("ly")){
            System.out.println("really?");
        }else{
            System.out.println("never mind");*/
        }


    }

