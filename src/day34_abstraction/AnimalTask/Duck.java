package day34_abstraction.AnimalTask;

public class Duck extends Animal implements Playable, Flyable, Swimable {
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat(){
        System.out.println("Ducks "+ getName()+ " eat worm" );
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
