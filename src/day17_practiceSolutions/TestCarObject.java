package day17_practiceSolutions;

public class TestCarObject {
    public static void main(String[] args) {
         Car car1= new Car();
         car1.setInfo("Toyota","Corolla",2022,"Silver",32000);

         Car car2= new Car();
         car2.setInfo("Honda", "Civic",2021, "White", 31000);

         Car car3 = new Car();
         car3.setInfo("Porsche", "Macan", 2022, "black", 12000);

        car2.start();

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);

    }

}
