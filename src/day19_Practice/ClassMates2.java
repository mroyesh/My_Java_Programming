package day19_Practice;

import java.util.Arrays;

public class ClassMates2 {
    public static void main(String[] args) {


        System.out.println("-----------------------------");


        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        boolean isInTheList = true;
        String receipt = "";
        for (int i = 0; i < items.length; i++) {
            if ( items[i].contains("Gloves") ) {
                System.out.println(items[i].indexOf('G'));
            }
            for (int j = 0; j <items.length ; j++) {
                if(items[i].equals("iPad")){
                    isInTheList=true;
            }
            }
            System.out.println("iPad is in the list "+isInTheList);

            String list= items[i]+prices[i]+itemIDs[i];
            System.out.println(list);


    }
}








    }

