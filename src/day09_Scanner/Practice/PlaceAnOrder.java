package day09_Scanner.Practice;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Inter the product name");
        String name = input.nextLine();
        System.out.println("Inter the price");
        double price =input.nextDouble();
        input.nextLine();
        System.out.println("Inter the number of quantity");
        int quantity= input.nextInt();
        input.nextLine();
        System.out.println("Enter your name ");
        String nameOfCustomer = input.nextLine();
        System.out.println(nameOfCustomer+", your order for "+ quantity+
                " "+ name+"  has been placed, your total is price is: "+(price*quantity)+"$");
    }
}
