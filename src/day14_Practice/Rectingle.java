package day14_Practice;

public class Rectingle {
    public static void main(String[] args) {
        String star = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j <= 6; j++) {
                star += " *";
                System.out.println(star);
            }
            System.out.println();
        }


    }
}