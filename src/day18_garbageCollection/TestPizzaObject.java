package day18_garbageCollection;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.setInfo('s', 2, 4);
        //pizza1.size='M';

        Pizza pizza2= new Pizza();
        //pizza2.size='S'
        pizza2.setInfo('s',  2, 4);

        System.out.println(pizza1);
        System.out.println(pizza2);


            double total=0;
        for (int i = 1; i <=20; i++) {

            Pizza small= new Pizza();
            small.setInfo('s', 3,2);
            total+=small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('m',4,3);
            total+=medium.calcCost();

             Pizza large = new Pizza();
             large.setInfo('l',3,5);
             total+=large.calcCost();
        }
        System.out.println("Total cost for all pizzas is:= $"+total);

    }
}
