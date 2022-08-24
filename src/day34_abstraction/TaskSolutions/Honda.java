package day34_abstraction.TaskSolutions;

public class Honda extends Car{
    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel()+ " has push button start");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+getModel()+ " is very improved car in it's class");

    }
}
