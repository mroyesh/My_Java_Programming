package day34_abstraction.TaskSolutions;

public class PersonalComputer extends Computer{
    protected PersonalComputer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }
}
