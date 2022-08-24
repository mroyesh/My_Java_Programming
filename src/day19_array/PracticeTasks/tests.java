package day19_array.PracticeTasks;

public class tests {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {4, 5, 6, 7, 8, 9};
        for (int each1 : num1) {
            for (int each2 : num2) {
                if ( each1 == each2 ) {
                    System.out.println(each1 + " ");
                }
            }
        }
    }
}
