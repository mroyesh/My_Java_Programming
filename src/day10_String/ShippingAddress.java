package day10_String;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your full name");
        String full_name=input.nextLine();
        System.out.println("Enter your building Number");
        String buildingNum= input.next();
        input.nextLine();
        System.out.println("Enter Your Street name");
        String streetName= input.nextLine();
        System.out.println("Enter your City Name");
        String CityName=input.nextLine();
        System.out.println("Enter your state");
        String StateName = input.nextLine();
        System.out.println("Enter your Zipcode");
        String Zipcode= input.next();
        input.nextLine();

        System.out.println("full_name= "+full_name);
        System.out.println("buildingNumber= "+buildingNum);
        System.out.println("StreetName= "+streetName);
        System.out.println("cityName= "+CityName);
        System.out.println("stateName= "+StateName);
        System.out.println("zipCode="+Zipcode);
        System.out.println("Your shipping address is:\n\t"+full_name+"\n\t"+buildingNum+" "+streetName+"\n\t"+CityName+", "+
                StateName+" "+Zipcode);
    }
}
