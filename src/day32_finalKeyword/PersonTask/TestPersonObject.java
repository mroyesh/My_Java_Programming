package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Employee employee= new Employee("Ali", 'M',35, LocalDate.of(1995,5, 13),"Developer",120000);
        Student student= new Student("Ezzat", 'M', 24, LocalDate.of(1997, 12, 6), 'A',"123ADW");
        Driver driver= new Driver("Shir", 'M', 39, LocalDate.of(1975, 12, 7));



        System.out.println(employee);
        System.out.println(student);
        System.out.println(driver);

        System.out.println("--------------------------");


        employee.sleep();
        employee.eat();
        employee.drink();

        student.sleep();
        student.eat();
        student.drink();

        driver.drink();
        driver.drive();
        driver.setName("Aziz");
        driver.drive();

        driver.breath();


    }
}
