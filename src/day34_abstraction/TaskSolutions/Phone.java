package day34_abstraction.TaskSolutions;

public class Phone extends Device {
    protected Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
    }

    @Override
    public void turnOff() {

    }

    public void call(long phoneNumber) {
        System.out.println("for calling to our office please dial number " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("if you need to request info via text, please text your number to this number " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{}"+
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
