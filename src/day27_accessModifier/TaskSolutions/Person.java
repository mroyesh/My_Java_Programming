package day27_accessModifier.TaskSolutions;

public class Person {
    public String name;
    public String language;
    public int age;
    public char gender;

    public static String planet;
    public static int numberOfWings;
    public static int numberOfhead;
    public static boolean hasNose;
    public static boolean isHuman;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }
    static {
        planet="earth";
        numberOfWings=0;
        numberOfhead=1;
        hasNose=true;
        isHuman=true;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}




