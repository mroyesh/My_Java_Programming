package day34_abstraction.TaskSolutions;


public abstract class Device {

    private final String brand, model, size;
    private double price;
    private String color;
    private boolean hasBattery, hasPowerButton;

    protected Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        if(brand==null|| brand.isEmpty()){
            System.err.println("invalid brand "+brand);
            System.exit(1);
        }
        this.brand = brand;
        if(brand==null|| brand.isEmpty()){
            System.err.println("Invalid model "+ model);
        }
        this.model = model;
        if(size==null||size.isEmpty()){
            System.err.println("invalid size " + size);
            System.exit(1);
        }
        this.size = size;
        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("invalid price "+ price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if( color==null|| color.isEmpty() ){
            System.err.println("Invalid color "+ color);
            System.exit(1);
        }
        this.color = color;
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

    public abstract void turnOn();

    public abstract void turnOff();


    @Override
    public String toString() {
        return  getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
