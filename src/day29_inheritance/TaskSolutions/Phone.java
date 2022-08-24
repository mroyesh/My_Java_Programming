package day29_inheritance.TaskSolutions;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;


    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        brand = null;
        return "Unknown";
    }

    public void setBrand(String brand) {
        if ( brand.isEmpty() || brand.isBlank() ) {
            System.out.println("Brand can not be empty or blank");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {

        model = null;
        return "Unknown";
    }

    public void setModel(String model) {
        if ( model.isBlank() || model.isEmpty() ) {
            System.out.println("Brand can not be empty or blank");
            System.exit(1);
        }
        this.model = model;
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
        if ( price <= 0 ) {
            System.out.println("Invalid price" + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        color = null;
        return "Unknown";
    }

    public void setColor(String color) {
        if ( color.isEmpty() || color.isBlank() ) {
            System.out.println("color can not be blank or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public void call(long phoneNumber) {
        System.out.println(getBrand() + " is calling " + phoneNumber);
    }

    public void tex(long phoneNumber) {
        System.out.println(getBrand() + " is texting");
    }

    public String toString() {
        return getClass().getSimpleName() +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

