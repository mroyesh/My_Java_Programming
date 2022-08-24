package day34_abstraction.TaskSolutions;

public class Computer extends Device{
    protected Computer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("For turning on the computer you need to press the power button");

    }

    @Override
    public void turnOff() {
        System.out.println("For turning off a computer you have two options");

    }
}
