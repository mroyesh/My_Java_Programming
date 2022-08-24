package day30_inheritance.TaskSolutions.deviceTasks;

public class Google extends Phone{

    public Google(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }
    public void isSmaller(){
        System.out.println(getBrand()+" "+ getModel()+ " has smaller size compared to Iphone and Samsung");
    }
}
