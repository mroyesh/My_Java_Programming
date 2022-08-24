package day28_encapsulation.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {


        ArrayList<Candy> candyMenu = new ArrayList<>();

        Candy candy1 = new Candy("Amarelli", 4, 12, false);
        Candy candy2 = new Candy("Golia", 10, 6, false);
        Candy candy3 = new Candy("Sperlari", 5, 8, true);
        Candy candy4 = new Candy("Ambrossoli", 13, 10, false);
        Candy candy5 = new Candy("Qand", 20, 1.99, false);

        candyMenu.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        for (Candy each : candyMenu) {
            System.out.println(each.getBrand()+" "+ each.getPrice());

        }


    }
}
