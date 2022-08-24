package day34_abstraction.TaskSolutions;

public class Samsung extends Phone implements downloadable, AndroidApp{
    protected Samsung(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApps() {

    }
}
