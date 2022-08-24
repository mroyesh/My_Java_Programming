package day30_inheritance.TaskSolutions.deviceTasks;

public class Samsung extends Phone {

    public Samsung(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }
    public void freeze(){
        System.out.println(getBrand()+", "+ getModel()+ " freezes a lot");
    }
}
