package day07_ifStatement;

import javax.management.MBeanAttributeInfo;

public class NetIncomeCal {
    public static void main(String[] args) {
        int salary =14000;
        double taxRate= 0;
        if (salary >=13000){
            taxRate=0.35;

        }
        System.out.println("Tax rate: = "+taxRate );
    }
}
