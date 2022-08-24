package day35_polymorphism;

import day27_accessModifier.Circle;
import day31_inheritance.Shape_MethodOverRiding.Shape;
import day33_abstraction.EmployeeTask.*;
import day34_abstraction.AnimalTask.*;
import day34_abstraction.CarTask.Audi;
import day34_abstraction.CarTask.Car;
import day34_abstraction.CarTask.Honda;
import day34_abstraction.CarTask.Tesla;

import java.util.Arrays;

public class PolyMorphismIntro {
    public static void main(String[] args) {
        Dog dog= new Dog("Max", "Husky", 'M', 4, "Small", "White");
        Cat cat= new Cat("xo", " xcom", 'M', 3, "Big", "Black");
        Eagle eagle=new Eagle("Ghor", " American eagle", 'M', 4, "Medium", "Brown");

        Tiger tiger=null;
        Lion lion=null;
        Parrot parrot= null;
        Dolphin dolphin= null;
        Shark shark= null;
        Duck duck= null;

        Animal[] animal= {dog, cat, eagle, tiger, lion, parrot, dolphin, shark, duck };

        System.out.println("------------------------------------------------------------");

        String str= "Java";
        Integer n= 100;
        Boolean r= false;
        Double d= 100.5;
        Circle circle= new Circle(4);

        Honda honda= new Honda("Honda", "CRV", 2022, 42000, "Black");

        Tesla tesla= new Tesla("Tesla", "Model X", 2022, 125000, "White");

        Audi audi= new Audi("Audi", "Q7", 2022, 120000, "Gray");

        Teacher teacher = new Teacher("Ali", 334, 'M', "234dsa", "math teacher", 120000);
        Developer developer= new Developer("Yasin", 35, 'M', "123DSA", "back-End developer", 120000, "Java");
        Driver driver= new Driver("Ali", 36, 'M', "432JHGF", "school bus driver", 12000);

        Tester tester= new Tester("Atiq", 37, 'M', "1234", "testing",120000);

        Object[] object= {str, n, r, d, circle, honda, tesla, audi, teacher, developer, driver, tester};

        Employee[] employees= {teacher, tester, driver, developer};
        Car[] cars= {honda, tesla, audi };

        Employee obj1= new Tester("Atiq", 37, 'M', "1234", "testing",120000);
        obj1.work();



        System.out.println(Arrays.toString(object));
        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.toString(employees));

    }
}
