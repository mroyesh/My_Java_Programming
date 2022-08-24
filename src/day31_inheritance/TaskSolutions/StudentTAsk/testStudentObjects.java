package day31_inheritance.TaskSolutions.StudentTAsk;

public class testStudentObjects {
    public static void main(String[] args) {
        CydeoStudent student1= new CydeoStudent("Yasin", 34, 'M',"234AD", "Java",
                'B',"Cydeo", 26, "Java",01);

        GraduateStudent student2= new GraduateStudent("Nazgul", 29, 'F',"3330000ADE", "business",
                'B',"SDCCD");


        System.out.println(student1);
        System.out.println(student2);


        System.out.println("-----------------------------");
        student1.eat();
        student2.study();
        student1.getStudentID();

    }
}
