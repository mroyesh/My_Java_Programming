package day33_abstraction.EmployeeTask;

import java.util.concurrent.CopyOnWriteArraySet;

public class TestEmployeeObject {
    public static void main(String[] args) {
        //Employee employee= new Employee("name", 23, 'M',"IDI","detve", 230000 );
        // we can not creat object from abstract class, Object Must be created from a concrete class

        Teacher teacher = new Teacher("Ali", 334, 'M', "234dsa", "math teacher", 120000);
        Developer developer= new Developer("Yasin", 35, 'M', "123DSA", "back-End developer", 120000, "Java");
        Driver driver= new Driver("Ali", 36, 'M', "432JHGF", "school bus driver", 12000);

        Tester tester= new Tester("Atiq", 37, 'M', "1234", "testing",120000);

        System.out.println("------------------------------------------");

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        teacher.work();
        developer.work();
        driver.work();
        teacher.work();





    }
}
