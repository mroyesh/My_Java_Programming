package day27_accessModifier;

public class TestCydeoStudentObject {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);


        CydeoStudent student1 = new CydeoStudent("Diana", 26, 'F');
        CydeoStudent student2= new CydeoStudent("Ali", 35, 'M');



        System.out.println(student1);
        System.out.println(student2);
        System.out.println(CydeoStudent.schoolName);
        System.out.println(CydeoStudent.secretCode);

        System.out.println(student1.schoolName);
        System.out.println(student1.secretCode);


    }
}
