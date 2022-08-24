package day26_statics.takes;

import java.time.LocalDate;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1= new Restaurant("Yasin", "123 Abc avenue", 4);
        Restaurant restaurant2= new Restaurant("Reza", "12321 A Street", 4);

        System.out.println(restaurant1);

        Server server1= new Server("Ali", 321, 15.6, true, LocalDate.of(2020, 11, 20));

        Server [] servers= {server1, server1, server1};


        Chef chef1= new Chef("Mohammad", 122, 23.5, true);
        Chef chef2= new Chef("Mohammad", 1231, 23.5, true);
        Chef chef3= new Chef("Mohammad", 1222, 21.5, true);
        Chef chef4= new Chef("Mohammad", 1234, 22.5, true);





    }

}
