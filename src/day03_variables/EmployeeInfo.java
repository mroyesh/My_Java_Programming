package day03_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        // employee name is Danial;
        /*String name = "Danial";
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("------------------------");*/

        String name = "Yasin";
        byte age = 45;
        char gender = 'M';
        String companyName = "Apple Inc";
        String employeeId = "A21";
        String jobTitle = "Java Developer";
        int salary = 100000;
        boolean isFullTime = true;
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(isFullTime);

        System.out.println("----------------------------------");

        System.out.println("employeeName = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("isFullTime = " + isFullTime);
    }
}
