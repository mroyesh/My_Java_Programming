package Lab04_Debage;

public class debagging {
    public static void main(String[] args) {
        System.out.println("Hello");
        String name = "Yasin";
        int age = 20;
        if ( name.equals("mike") ) {
            System.out.println("correct info");
        } else {
            System.out.println("wrong info");
        }
        for (int i = 0; i < 3; i++) {//
            if ( i == 2 ) {
                method1();
            } else {
                method2();
            }


        }
    }

    private static void method2() {
        System.out.println("I am inside method 2");
    }

    private static void method1() {
        System.out.println("I am inside method 1");

    }
}
