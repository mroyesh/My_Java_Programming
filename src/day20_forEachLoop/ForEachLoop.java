package day20_forEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

        System.out.println("---------------------");


        for (int each : numbers) {
            System.out.print(each + ", ");
        }
    }
}
