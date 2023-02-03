package day24_DateAndTime;

import day17_CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class removeElementsFromCollections {
    public static void main(String[] args) {

        ArrayList<Integer>list5= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));


        for (int i = 0; i < list5.size(); i++) {
                list5.remove(i);
            }
        System.out.println(list5);




//        list5.removeIf(p->p<10);
//        System.out.println(list5);
//








        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        for (int i = 0; i < list.size(); i++) {

                list.removeAll(Arrays.asList(1,2,3,4));
        }

        System.out.println(list);

        System.out.println("--------------------------------");

        ArrayList<Integer>list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        list1.removeIf( p -> p<4);
        System.out.println(list1);

        System.out.println("---------------------------------");

        ArrayList<String>names= new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "C#","Java","C++","JavaScript","C+"));
        names.removeIf( each -> each.startsWith("J"));
        System.out.println(names);

        System.out.println("-----------------------------");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");
        employees.removeIf(p->p.salary>100000);// in this case p== employee
        for (Employee each : employees) {
            System.out.println(each.name+ " "+ each.salary);

        }
    }
}
