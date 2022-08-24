package day30_inheritance.TaskSolutions.deviceTasks;

public class Computer extends DeviceTask1{


    public Computer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }
}
