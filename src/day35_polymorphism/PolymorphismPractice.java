package day35_polymorphism;

import day34_abstraction.AnimalTask.*;
import day35_polymorphism.Task.*;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Animal tiger= new Tiger("Karzai", "Bengal", 'M', 29, "large", "white");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        Animal eagle= new Eagle("John", " American Eagle", 'M', 3, "small", "Black");

        Lion lion= null;

        Parrot parrot=null;
        Eagle eagle1= null;
        Shark shark= null;
        Dolphin dolphin= null;
        Duck duck= null;
        CydeoCar cydeoCar= null;

        Flyable[] birds= {parrot, eagle1};

        Swimable[] swimable ={shark, dolphin,duck};

        System.out.println("--------------------------");
        Car car= new day35_polymorphism.Task.Tesla("Tesla", "Model X", "Black", 2022, 120000);

        boolean isTesla= car instanceof Tesla;
        boolean isAudi= car instanceof Audi;

        boolean isElectricCar= car instanceof Electric;

        boolean isAutoPilot= car instanceof AutoPilot;

        boolean isAutoPark= car instanceof AutoPark;


        System.out.println("isAudi = " + isAudi);
        System.out.println("isTesla = " + isTesla);
        System.out.println("isElectricCar = " + isElectricCar);

        System.out.println("isAutoPilot = " + isAutoPilot);
        System.out.println("isAutoPark = " + isAutoPark);


    }
}
