package day34_abstraction.CarTask;

public class Audi extends Car {
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void star(){
        System.out.println("Press the start button tp start"+ getMake()+ getModel());
    }

    public void autoPilot(){
        System.out.println(" has function to part auto");
    }


}
