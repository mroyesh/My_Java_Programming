package day28_encapsulation.Encopsulation;

public class Test {
    public static void main(String[] args) {

        Student student= new Student();
        System.out.println(student.getAge());

        student.setAge(34);

        System.out.println( student.getAge());
        System.out.println("Test Completed");
    }
}
