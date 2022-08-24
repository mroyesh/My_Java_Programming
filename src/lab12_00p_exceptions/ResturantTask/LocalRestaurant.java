package lab12_00p_exceptions.ResturantTask;

public class LocalRestaurant {
    public static void main(String[] args) {


        Employee employee1 = new Server("Emily", "A123", "server", 34, 'M', 45000);
        employee1.work();
        ((Server) employee1).takeOrder();
        ((Server) employee1).cleanTable();


        Employee employee2= new Chef("Ali", "A123", "Head Chef", 23, 'F', 34000);
        employee2.work();
        ((Chef) employee2).makeOrder();
        ((Chef) employee2).washDishes();


        System.out.println("----------------------------------------");

        try{
            ((Server) employee2).takeOrder();
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("--------------------------------------");

        Server server1= new Server("Hadi", "A12341", "server", 34, 'M', 35000);
        Chef chef1= new Chef("Aziz", "A43214", "Head Chef", 45, 'M', 55000);

         Restaurant restaurant = new Restaurant("Yasin", "Mera mesa blvrd", 4.9);

         restaurant.hireServer(( Server) employee1);
         restaurant.hireChef((Chef) employee2);

        restaurant.hireServer(server1);
        restaurant.hireChef(chef1);

        System.out.println("-------------------------------------");


        for(Chef eachChaf: restaurant.getChefs()) {
            System.out.println(eachChaf);
        }

        System.out.println("---------------------------------------");


        for( Server eachServer: restaurant.getServers()){
            System.out.println(eachServer);
        }

        System.out.println("---------------------------------------");

        Server s= null;
        Chef c= null;

        //restaurant.hireChef(c);;
       // restaurant.hireServer(s);






    }


}
