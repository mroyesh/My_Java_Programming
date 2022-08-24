package day30_inheritance.TaskSolutions.deviceTasks;

public class Iphone extends Phone{
    public Iphone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand()+ " "+ getModel()+ " do facetime by " +phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(getBrand()+ " "+ getModel()+ " can facetime by "+ email);
    }
}
