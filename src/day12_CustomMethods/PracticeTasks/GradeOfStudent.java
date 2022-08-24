package day12_CustomMethods.PracticeTasks;

public class GradeOfStudent {
    public static void main(String[] args) {

        GradeCheck(23);

    }
    public static void  GradeCheck(int score){

        if(score>=0 && score<=100){
         if(score>=90){
             System.out.println("grade = A");
         }else if(score>=80){
             System.out.println("grade = B");
         }else if(score>=70){
             System.out.println("grade = C");
         }else if(score>=60){
             System.out.println("grade = Passed");
         }else if(score<60){
                System.out.println("grade = Failed");
            }
            }else{
            System.out.println("not valid entry");
        }

    }





}
