package day28_encapsulation.PracticeTasks;

public class TestItemObject {
    public static void main(String[] args) {


        Item item1 = new Item("toilet paper", 1299, 600);
        System.out.println(item1.getName()+" Total cost: $"+item1.calcCost());

        item1.setUnitPrice(1499);
        System.out.println(item1);

    }
}
