package day31_inheritance.animal_MethodOverRiding;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);


    }
    @Override
    public void eat(){
        System.out.println("Dog " +getName()+ " is eating dog food");
    }

    public void scratch(){
        System.out.println("Dog "+ getName()+ " is barking");
    }

}
