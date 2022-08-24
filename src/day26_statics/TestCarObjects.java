package day26_statics;

import day26_statics.Car;

public class TestCarObjects {
    public static void main(String[] args) {
        Car car1= new Car("Toyota");
        Car car2= new Car("Audi", "Q8");
        Car car3= new Car("Mircedes Benz", "LG550", 2022);
        Car car4= new Car("Tesla", "Model X", 2022, 120000);
        Car car5= new Car("Honda", "Accord", 2021, 31000, "White");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
