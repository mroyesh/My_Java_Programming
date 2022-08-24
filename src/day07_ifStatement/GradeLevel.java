package day07_ifStatement;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 23;
        if ( gradeLevel >= 1 && gradeLevel <= 18 ) {
            if ( gradeLevel >= 1 && gradeLevel <= 5 ) ;
            System.out.println("Elementary");
        } else if ( gradeLevel > 5 && gradeLevel <= 9 ) {
            System.out.println("Meddle school");
        } else if ( gradeLevel > 9 && gradeLevel <= 12 ) {
            System.out.println("High school");
        } else if ( gradeLevel > 12 && gradeLevel <= 14 ) {
            System.out.println("Freshman");
        } else if ( gradeLevel>14 && gradeLevel<=16 ) {
            System.out.println("grade college");
        } else if ( gradeLevel>16 && gradeLevel <=18 ) {
            System.out.println("post grade");
        } else {
            System.out.println("Invalid grade");
        }
        }

    }



