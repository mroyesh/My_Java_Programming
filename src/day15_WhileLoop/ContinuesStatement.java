package day15_WhileLoop;

public class ContinuesStatement {
    public static void main(String[] args) {
        /*for (int i = 0; i < 100; i++) {
            if(i % 2 !=0){
                continue;
            }
            System.out.println(i);*/

        for (int j = 0; j < 20; j++) {
            if ( j % 2 == 0 ) {

            }
            System.out.print(j+ " ");

            System.out.println();
        }
        for (int i = 10; i < 21; i++) {

            if ( i % 2 == 0 ) { // if i is even
                continue; // skips the current iteration
            }

            System.out.println(i);
        }
    }
}