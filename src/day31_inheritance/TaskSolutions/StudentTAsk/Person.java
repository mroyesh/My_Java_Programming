package day31_inheritance.TaskSolutions.StudentTAsk;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name == null || name.isEmpty() ) {
            System.out.println("Invalid name " + name);
            System.exit(1);
        }
        for (int i = 0; i < name.length(); i++) {
            if ( !Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i) != ' ' ) {
                System.out.println("Invalid name" +name);
                System.exit(1);
            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age <= 0 ) {
            System.out.println("Age can not set to zero or negative");
            System.exit(1);
        }
        this.age = age;
    }
    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'F' )){
            System.out.println("Gender can not set to "+gender);
            System.exit(1);
        }
            this.gender = gender;
    }
    public void eat(){
        System.out.println(name+ " is drinking");
    }

    public void drink(){
        System.out.println(name+ " is eating");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping longer than others");
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
