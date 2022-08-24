package day31_inheritance.animal_MethodOverRiding;

public class TestAnimalObject {

    public static void main(String[] args) {


        Cat cat = new Cat("Juju", "Bangal", 'F', 5, "Big", "Black");

        Dog dog = new Dog("Max", " German Sheepred", 'M', 6, "Large", "Brown");

        Lion lion = new Lion("Cheeha", "Babgal", 'F', 23, "large", "Yellow", "true");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);


        System.out.println("---------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();

        cat.sleep();
        dog.sleep();
        lion.eat();




    }
}
