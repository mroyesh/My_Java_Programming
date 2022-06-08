package lab07_ClassAndObjects;



public class Car {



    public String brand,model;
    public int year;
    public String color;
    public double price;

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void setInfo(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    public void driving(){
        System.out.println("this car ");
    }
}
