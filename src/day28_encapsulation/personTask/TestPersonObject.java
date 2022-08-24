package day28_encapsulation.personTask;

public class TestPersonObject {
    public static void main(String[] args) {


        Person person1 = new Person("Ali");
        Person person2 = new Person("Yasin", 'M');
        Person person3 = new Person("Dianna", 25, 'M');
        Person person4 = new Person("Jawid", "English", 'M', 'M');
        Person person5 = new Person("Nazgul", 27);


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

    }


}
