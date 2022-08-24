package day24_DateAndTime;


import java.util.ArrayList;
import java.util.Arrays;

import day17_CustomClass.Employee;

public class ArrayListPractice {

    public static void main(String[] args) {

        /*ArrayList<Integer>num= new ArrayList<>();
        num.addAll(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        num.removeIf(p->p<5);
            System.out.println(num);*/

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");
        employees.get(4).setInfo("Yasin", 30, 'M', "Developer",120000, "AB123");

        for (Employee eachEmployees : employees) {
            System.out.println(eachEmployees.name + " " + eachEmployees.jabTitle);

            double salary=employees.get(3).salary;

            System.out.println("salary of third employee =: "+salary);

            for (Employee each : employees) {
                if ( each.jabTitle.equals("Java Developer") ) {
                    System.out.println(each.name);
                }

            }

            double max= employees.get(0).salary;
            for (Employee each : employees) {
                if ( each.salary > max ) {
                    max= each.salary;
                }
            }
            double min= employees.get(0).salary;
            for (Employee each : employees) {
                if(each.salary<min){
                    min= each.salary;
                }
            }
            System.out.println("min = " + min);
            System.out.println("Max Salary="+max);
        }
        ArrayList<Employee>femaleEmployee= new ArrayList<>();
        ArrayList<Employee>maleEmployee= new ArrayList<>();
        for (Employee each : employees) {
            if(each.gender=='M'){
                maleEmployee.add(each);
            }else{
                femaleEmployee.add(each);
            }

        }
        System.out.println("maleEmployee = " + maleEmployee);
        System.out.println("femaleEmployee = " + femaleEmployee);

    }
}

/*
1. Given the following arraylist of Employees:
            ArrayList<Employee> employees = new ArrayList<>();
            employees.addAll(Arrays.asList(
                   new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
            ));

            employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
            employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
            employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
            employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
            employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

            Note: Employee class is imported from day17 package

        1.1 Write a program that can display the name and job title of each employee

        1.2 Write a program that can display the names of "Java Developers"

        1.3 Write a progam that can display the maximum and minimum salary

        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists
 */
