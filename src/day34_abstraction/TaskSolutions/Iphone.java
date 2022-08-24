package day34_abstraction.TaskSolutions;

public class Iphone extends Phone implements downloadable, AppleApps {
    protected Iphone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApps() {
        System.out.println("Iphone app store do not support as many apps as android app store do");

    }
}
