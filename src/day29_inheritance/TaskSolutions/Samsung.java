package day29_inheritance.TaskSolutions;

public class Samsung extends Phone {
    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }
    public void freezes(){
        System.out.println(getBrand()+ " freezes most of the time");
    }

}
