package day34_abstraction.CarTask;

public class Honda extends Car{

    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void star() {
        System.out.println("With the key to ignition"+ getMake()+ getModel());

    }
}
