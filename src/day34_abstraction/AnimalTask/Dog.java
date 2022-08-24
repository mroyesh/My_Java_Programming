package day34_abstraction.AnimalTask;

public class Dog extends Animal implements Playable, Swimable {


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + " is eating dog food");
    }

    @Override
    public void play() {
        System.out.println(getName() + " play with their owners");
    }

    @Override
    public void swim() {

    }
}
