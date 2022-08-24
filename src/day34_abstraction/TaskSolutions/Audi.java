package day34_abstraction.TaskSolutions;

public class Audi extends Car implements AutoPark {

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ getModel()+ " has the feature of auto parking");

    }

    @Override
    public void start() {
        System.out.println("Starting "+getMake()+getModel()+ " you need to twist the key");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+getModel()+" has a successful driver assistant drive mode");

    }
}
