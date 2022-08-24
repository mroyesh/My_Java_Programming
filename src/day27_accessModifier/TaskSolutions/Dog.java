package day27_accessModifier.TaskSolutions;

public class Dog {
    public String breed;
    public String size;
    public String color;
    public char gender;
    public int age;
    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;
    public static boolean isFriendly;

    public Dog(String breed, String size, String color, char gender, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }
    static {
        numberOfLegs=4;
        numberOfEyes= 2;
        numberOfWings=0;
        isFriendly=true;


    }
    public static void eat(){
        System.out.println("the dog is eating");
    }
    public static void drink(){
        System.out.println("the dog is drinking water");
    }
    public static void sleep(){
        System.out.println("the dog is sleeping");
    }

    public static void play(){
        System.out.println("the dog is playing");
    }
    public static void bark(){
        System.out.println("the dog is barking");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
