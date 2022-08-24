package day26_statics.takes;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner, Location;
    public int numberOfStars;
    public ArrayList<Server> servers= new ArrayList<>();
    public ArrayList<Chef> chefs= new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;

    }
    public void hireServer(Server server){
        servers.add(server);

    }
    public void hireServer( Server[] server){
        servers.addAll(Arrays.asList(server));
    }
    public void  hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[] chef){
        chefs.addAll(Arrays.asList(chef));
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p-> true);

    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                '}';
    }
}
