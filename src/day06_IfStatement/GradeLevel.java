package day06_IfStatement;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 9;
       if (gradeLevel >= 1 && gradeLevel <= 5) {
            System.out.println("Elementary School");
        }
        if (gradeLevel >= 6 && gradeLevel <= 8) {
            System.out.println(" Middle School");
        }
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            System.out.println(" High School");
        }
        if (gradeLevel >= 13 && gradeLevel <= 16) {
            System.out.println("College");
        }
        if (gradeLevel >= 17 && gradeLevel <= 18) {
            System.out.println(" Grade");
        }

        int gradeLevel1 = 16;
        String result = "";// temporary value
        if (gradeLevel >= 1 && gradeLevel1 <= 18) {
            if (gradeLevel1 <= 5) {
                result = " Elementry";
            } else if (gradeLevel1 <= 8) {
                result = " Middle School";
            } else if (gradeLevel1 <= 12) {
                result = "High School ";
            } else if (gradeLevel1 <= 16) {
                result = " college";
            } else {
                result = "post Graduate ";
            }
            System.out.println("result = " + result);
        /*if (gradeLevel <= 8) {
            result = " Middle School";
        }
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            result = " High Schoo";
        }
        if (gradeLevel >= 13 && gradeLevel <= 16) {

            result = " college";
        }
        if (gradeLevel >= 17 && gradeLevel <= 18) {
            result = " Grad";
        }
        System.out.println("result = " + result);*/
        }
    }
}

