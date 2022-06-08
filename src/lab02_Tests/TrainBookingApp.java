package lab02_Tests;

import java.util.Scanner;/// in your current package you can use all classes
public class TrainBookingApp {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);/// if you want to use any properties belongs to class you have to creat object
        System.out.println("do you have a bag?(yes: true, No: false");
        boolean hasBag= input.nextBoolean();
        System.out.println(" directdeparture only? yes;true, No:false");
        boolean nonStop = input.nextBoolean();
        System.out.println("choose your travel type(train:1, bus:2, flight:3");
        int  transportType= input.nextInt();
        System.out.println("from: ");
        String from = input.next();

        System.out.println("To:");
        String to = input.next();
        String train1= "TR001";
        String train2= "TR002";
        String train3= "TR003";
        String bus1= "BU001";
        String bus2= "BU002";
        String bus3= "BU001";

        String flight1= "FL001!";
        String flight2= "FL002";
        String flight3= "FL003";


        if(!(from.equalsIgnoreCase("burline")&&to.equalsIgnoreCase("amsterdam"))){
            System.out.println(" for now you can only serve yu berline-Amesterdam transportaion. Please change your distination");
            return; /// stop JVM
        }
        switch (transportType) {
            case 1: //train
                if(nonStop && hasBag) {
                System.out.println("you can take " + train3);
            }else if (nonStop&&!hasBag){
            }else if (!nonStop& hasBag){
            }else {
                System.out.println("you can take train" + train1 + train2 + train3);
            }
            case 2: // bus
                System.out.println("you can take "+bus1+bus2+bus3);
                break;
            case 3: // flight
                if(nonStop&&hasBag){
                    System.out.println("could not find flight for and check flight and try again");
                    return;
                }else if (!nonStop&&hasBag){
                    System.out.println("you can take " +flight1);
                    return;
                }else if (nonStop&&!hasBag){
                    System.out.println("you can take "+flight2);
                    return;
                }else{
                    System.out.println("you can take flight"+flight1+flight2+flight3);
                }
                break;
            default:
                System.out.println("No such a search available");
        }








        }
    }
