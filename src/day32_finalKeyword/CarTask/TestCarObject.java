package day32_finalKeyword.CarTask;

public class TestCarObject {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "blue", 2022, 35000);
        Honda honda = new Honda("Accord", "Black", 2021, 26000);
        BMW bmw = new BMW("X6", "White", 2022, 69000);
        Audi Audi= new Audi("Q8", "Silver", 2022, 130000);
        Tesla tesla= new Tesla("Model X", "White", 2022, 135000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(bmw);
        System.out.println(Audi);
        System.out.println(tesla);


        System.out.println("---------------------------------");
        toyota.start();;
        honda.start();
        bmw.start();
        Audi.start();
        tesla.start();

        System.out.println("-----------------------------------");


        tesla.getYear();
        System.out.println(tesla.getPrice());

    }
}
