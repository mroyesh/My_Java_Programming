package day34_abstraction.TaskSolutions;

public class Tesla extends Car implements AutoPark, AutoPilot{
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("In "+getMake()+getModel()+" auto park is optional package during purchase");

    }

    @Override
    public void selfDrive() {
        System.out.println("having self drive options in "+getMake()+ getModel()+ " is very expensive feature to include in the package" );

    }

    @Override
    public void start() {
        System.out.println("In "+ getMake()+ getModel()+ " driver needs to tel the car to start");

    }

    @Override
    public void drive() {
        System.out.println("self drive is one of the most important feature of "+ getMake()+getModel());

    }
}
