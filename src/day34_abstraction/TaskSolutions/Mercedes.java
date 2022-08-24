package day34_abstraction.TaskSolutions;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+getModel()+ " has very accurate feature of auto park among cars");

    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel()+ " has same as most cars push button start");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+getModel()+ " is a great family car");

    }
}
