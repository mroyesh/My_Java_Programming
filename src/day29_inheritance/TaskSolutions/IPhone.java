package day29_inheritance.TaskSolutions;

public class IPhone extends Phone{
    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }
    public void faceTime(long phoneNumber){
        System.out.println(getBrand()+" making facetime "+ phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(getBrand()+ " making facetime by "+ email);
    }
}
