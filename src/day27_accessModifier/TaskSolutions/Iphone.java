package day27_accessModifier.TaskSolutions;

public class Iphone {
    public String model, size, color;
    public int price;

    public static String brand, OS, madeIn, designedIn;

    public static boolean isSmartPhone;

    public Iphone(String model, String size, String color, int price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        brand="Apple";
        OS= "iOS";
        madeIn="China";
        designedIn="California";
    }
    public static void printOperatingSystem(){
        System.out.println("Operations system is: "+OS);
    }
    public static void call(long phoneNumber){
        System.out.println("phone number is : "+phoneNumber);
    }
    public static void text(long phoneNumber){
        System.out.println("Texting number is :"+ phoneNumber);
    }
    public static void faceTime(long phoneNumber){
        System.out.println("face time is :"+phoneNumber);
    }
    public static void faceTime(String email){
        System.out.println("face time is :"+email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
