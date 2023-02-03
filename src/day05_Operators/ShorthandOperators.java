package day05_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int salary = 12000;
        double bonus = 0.12 * salary;
        System.out.println(bonus);
        double transportation = 900;
        salary += 1000;
        System.out.println(salary);
        int distance = 1200;
        int roundTrip = distance *= 2;
        System.out.println(roundTrip);
        int x = 12, y = 10;
        x += y;
        System.out.println(x);
        x -= y;
        System.out.println(x);
        int c = 13, d = 2;
        c %= d;
        System.out.println(c);

        double e = 12, f = 7;
        e /= f;
        System.out.println(e);




        /*int a = 20;
        System.out.println(a);
        a = 40;
        System.out.println(a);

        double balance = 1000;
        balance += 10000; // balance = 11000
        System.out.println("balance = " + balance);
        balance += 500; // balance = 11500
        System.out.println("balance = " + balance);
        balance += 5000;
        System.out.println("balance = " + balance); // balance tell now 16500
        balance -= 1000;
        System.out.println("balance = " + balance);
        balance -= 5000;
        System.out.println("balance = " + balance);
        System.out.println("--------------------");

        double salary = 45000;
        salary *= 2;
        System.out.println(salary);
        double doge = 0.00000123;
        doge *=1000;
        System.out.println(doge);
        double eth = 4;
        eth *=250;
        System.out.println(eth);
        eth /=2;
        salary /=2;
        System.out.println(salary);*/

       /* int a = 35;
        a %= 7; // it divides 35 to 7 first and gives us the reminder*/


    }

}
