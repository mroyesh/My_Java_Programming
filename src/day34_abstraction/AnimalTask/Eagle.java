package day34_abstraction.AnimalTask;

public class Eagle extends Animal implements Flyable, IsWildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
