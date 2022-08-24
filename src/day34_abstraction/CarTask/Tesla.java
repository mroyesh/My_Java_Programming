package day34_abstraction.CarTask;

public class Tesla extends Car{
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void star() {

    }

    public void  autoPilot(){
        System.out.println(getMake()+" "+ getModel()+" has auto pilot feature" );
    }


}
