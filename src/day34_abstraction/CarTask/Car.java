package day34_abstraction.CarTask;

public abstract class Car {
    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, int year, double price, String color) {
        this.make = getClass().getSimpleName();
        this.model = model;
        if(year<1886){
            System.out.println(" Invalid year");
            System.exit(1);
        }
        this.year = year;
        if(price<=0){
            System.out.println("Invalid price"+ price);
            System.exit(1);

        }
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {

        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected final void stop(){
        System.out.println("Press the break to stop "+ make+ model);
    }

    protected abstract void star();


    @Override
    public String toString() {
        return   make+ "{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
