package day34_abstraction.TaskSolutions;

public class BMW extends Car{
    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel()+" push button start");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+getModel()+" is very comfort car for long distinction drive");

    }
}
