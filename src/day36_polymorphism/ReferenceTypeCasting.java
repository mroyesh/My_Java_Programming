package day36_polymorphism;

import day29_inheritance.AnimalTask.Animal;
import day29_inheritance.AnimalTask.Cat;
import day29_inheritance.AnimalTask.Dog;
import day30_inheritance.PhoneTask.Nokia;
import day30_inheritance.PhoneTask.Phone;
import day33_abstraction.EmployeeTask.Developer;
import day33_abstraction.EmployeeTask.Employee;
import day35_polymorphism.Task.Electric;
import day35_polymorphism.Task.Tesla;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Animal animal1 = new Dog();// upcasting and polymorphism.
        animal1.setInfo("John", "German Sheperd", 'M', 5, "Big", "Black");
        animal1.setColor("White");
        animal1.setSize("Large");

        ((Dog) animal1).bark();
        Dog dog1= (Dog)animal1;
        System.out.println(dog1);

        System.out.println("----------------------------------------------------");

        Phone phone = new Nokia("Lumia", "Medium", "White", 999);
        phone.call(123);
        phone.text(1234);

        ((Nokia) phone).selfDefence();


        System.out.println("----------------------------------------------------");

        Employee employee1= new Developer("Yasin", 35, 'M', "123d", "Back End Developer", 150500, "Java");

        employee1.work();
        System.out.println(((Developer) employee1).getProgramingLanguage());

        System.out.println("-----------------------------------------------");


        Electric electric= new Tesla("Tesla", " Model Y", "Black", 2022, 120000);
         electric.charge();
        ((Tesla) electric).selfDrive();
        ((Tesla) electric).autoPark();
        ((Tesla) electric).transportPeople();






    }
}
