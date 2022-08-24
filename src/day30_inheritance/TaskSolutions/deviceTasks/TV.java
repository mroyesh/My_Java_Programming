package day30_inheritance.TaskSolutions.deviceTasks;

public class TV extends DeviceTask1{

    public TV(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void size(){
        System.out.println(getBrand()+ ", "+ getModel()+" has high quality resolutions");
    }
    public void channelUp(){
        System.out.println(getBrand()+ " remote has one button works for channel up and down");
    }
    public void channelDown(){
        System.out.println(getBrand()+ ", "+ getModel()+ " channel down button is confusing" );
    }

}
