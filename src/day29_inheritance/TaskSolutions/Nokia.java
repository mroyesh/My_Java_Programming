package day29_inheritance.TaskSolutions;

import javax.swing.plaf.IconUIResource;

public class Nokia extends Phone{

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefence(){
        System.out.println(getBrand()+ getModel()+ " can be used for selfDefence");

    }
}
