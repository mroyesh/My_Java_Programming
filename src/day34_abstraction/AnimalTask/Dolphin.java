package day34_abstraction.AnimalTask;

public class Dolphin extends Animal implements Playable, IsWildAnimal, Swimable{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat(){
        System.out.println("Dolphin "+ getName()+ " eat fish");
    }

    @Override
    public void play() {
        System.out.println("People train dolphins to play");
    }

    @Override
    public void swim() {
        System.out.println(getName()+ " swims at least 12 hours a day");

    }
}
