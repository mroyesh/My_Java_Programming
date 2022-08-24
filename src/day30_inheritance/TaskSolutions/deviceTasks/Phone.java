package day30_inheritance.TaskSolutions.deviceTasks;

public class Phone extends DeviceTask1{


    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }
    public void call(){
        System.out.println(getBrand()+", "+ getModel()+ " has great calling quality");
    }

    public void text(){
        System.out.println(getBrand()+", "+ getModel()+ " delivers texts late");
    }

}

