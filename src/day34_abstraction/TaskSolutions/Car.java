package day34_abstraction.TaskSolutions;

public abstract class Car {
    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if(make== null|| make.isEmpty()){
            System.out.println("invalid make"+ make);
            System.exit(1);
        }
        this.make = make;
        if(model==null||model.isEmpty()){
            System.out.println("Invalid model"+ model);
            System.exit(1);
        }
        this.model = model;
        if(year<1886 ){
            System.out.println("Invalid year"+ year);
            System.exit(1);
        }
        this.year = year;
       setPrice(price);
        setColor(color);
    }

    public String getMake() {

        return make;
    }

    public String getModel() {

        return model;
    }

    public int getYear() {

        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("Price can not set to negative "+ price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if( color== null|| color.isEmpty() ){
            System.out.println("Color can not set as"+ color);
            System.exit(1);
        }
        this.color = color;
    }
    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println("to stop the car press the break puddle");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

