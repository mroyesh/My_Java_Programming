package day29_inheritance.AnimalTask;

public class Dog extends Animal { // dog is an animal
    public void method(){
        System.out.println(getName());
        System.out.println(getBreed());
        System.out.println(getGender());
        System.out.println(getAge());
        System.out.println(getColor());
        System.out.println(isAnimal);
    }
    public void bark(){
        System.out.println(getName()+" is barking");

    }

    public static void main(String[] args) {


    }
}
