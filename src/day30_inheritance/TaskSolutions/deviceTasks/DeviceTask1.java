package day30_inheritance.TaskSolutions.deviceTasks;

public class DeviceTask1 {
    private String brand, model, color, size;
    private double price;
    private boolean hasBattery, hasPowerButton;


    public DeviceTask1(String brand, String model, String color, String size,
                       double price, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        if ( brand == null ) {
        }
        return "Unknown";
    }

    public void setBrand(String brand) {
        if(brand.isEmpty()||brand.isBlank()){
            System.out.println("brand can not be empty or blank");
        }
        this.brand = brand;
    }

    public String getModel() {
        if ( brand == null ) {
        }
        return "Unknown";
    }

    public void setModel(String model) {
        if(brand.isBlank()|| brand.isEmpty()){
            System.out.println("Brand can not be empty or blank");
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println(brand+", "+ model+ " can turn on automatically");
    }
    public void turnOff(){
        System.out.println(brand+ ", "+model+ " turns of most of the time when battery lows to 10%");
    }

    public String toString() {
        return getClass().getSimpleName() +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
