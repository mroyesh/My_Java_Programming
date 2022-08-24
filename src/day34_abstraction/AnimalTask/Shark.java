package day34_abstraction.AnimalTask;

public class Shark extends Animal implements Hunt, Swimable {
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat(){
        System.out.println("Shark"+ getName()+ " is eating fish");
    }


    @Override
    public void hunt() {
        System.out.println("Dolphins hunt fishes.");

    }

    @Override
    public void swim() {

    }
}
