package day34_abstraction.TaskSolutions;

public class Desktop extends Computer{
    protected Desktop(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }
}
