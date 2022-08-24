package day34_abstraction.TaskSolutions;

public class NIO extends Car implements AutoPark, AutoPilot {
    public NIO(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(" starting features of NIO seems copied from Tesla");

    }

    @Override
    public void drive() {
        System.out.println(" NIO has also the features of driver assistant");

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }
}
