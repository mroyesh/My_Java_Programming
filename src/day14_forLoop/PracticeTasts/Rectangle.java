package day14_forLoop.PracticeTasts;

public class Rectangle {
    public static void main(String[] args) {
        String star = "";
        for (int i = 0; i <2; i++) {
            for (int j = 1; j <= 3; j++) {
                star += " *";
                System.out.println(star);
            }
        }
    }
}