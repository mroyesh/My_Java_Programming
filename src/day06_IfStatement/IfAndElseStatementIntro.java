package day06_IfStatement;

public class IfAndElseStatementIntro {
    public static void main(String[] args) {

        int age = 34;
        if(age >=21){
            System.out.println("The person is eligible");
        }
        System.out.println("------------------");

        if ( age > 21){
            System.out.println("The person is eligible");
        }else{
            System.out.println("The person is not eligible");
        }
    }

}
