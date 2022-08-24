package day30_inheritance.TaskSolutions.PlanetTasks;

public class Earth extends PlanetTask{


    public Earth(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume);
    }
    public void hasWater(){
        System.out.println("earth is the only planet which can keep sustain liquid water");
    }

    public void hasLivingThings(){
        System.out.println("Earth is the only planet known as contains living things");
    }
}
