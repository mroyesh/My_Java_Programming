package day17_CustomClass;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.setInfo("Ali",24,'M',"Back- end developer",
                98000, "CDPC123");

        Employee employee2=new Employee();
        employee2.setInfo("Aziz",35,'M',"Driver",120000,"ACD123");

         Employee employee3= new Employee();
         employee3.setInfo("Hadi", 45, 'M',"Tester", 123700, "APX1234");

        Employee employee4= new Employee();
        employee4.setInfo("Reza", 47, 'M',"Front-end developer", 190700, "APY234");

        Employee employee5= new Employee();
        employee5.setInfo("Sayed", 49, 'F',"senior developer", 245000, "ABD123432");

        System.out.println("Employee1 = " + employee1);
        System.out.println("Employee2 = " + employee2);
        System.out.println("Employee3 = " + employee3);
        System.out.println("Employee4 = " + employee4);
        System.out.println("Employee5 = " + employee5);
        employee2.work();
    }
    }

