package day34_abstraction.TaskSolutions;

public class CydeoCar extends Car implements AutoPilot, AutoPark, Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ getModel()+ " has a self park capability");

    }

    @Override
    public void selfDrive() {
        System.out.println("In "+ getMake()+getModel()+ " delf drive feature is improved compared to old models");

    }

    @Override
    public void start() {
        System.out.println("you only need to tell to the "+ getMake()+ getModel()+ " start and the car starts");

    }

    @Override
    public void drive() {
        System.out.println("The "+ getMake()+ getModel()+ " has driver assistant mode");

    }

    @Override
    public void fly() {
        System.out.println("Cydeo has plan to make self drive their "+getMake()+ getModel()+ " in 2025");

    }
}
