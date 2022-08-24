package day30_inheritance.TaskSolutions.PlanetTasks;

public class PlanetTask {
    private String name;
    private double mass;
    private double radius;
    private double surfaceGravity;
    private double surfaceArea;
    private double volume;

    public PlanetTask(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume) {
        setName(name);
        setMass(mass);
        setRadius(radius);
        setSurfaceGravity(surfaceGravity);
        setSurfaceArea(surfaceArea);
        setVolume(volume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(double surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String toString() {
        return  getClass().getSimpleName() +
                ", Planet name=' " + name + '\'' +
                ", mass= " + mass +
                ", radius= " + radius +
                ", surfaceGravity= " + surfaceGravity +
                ", surfaceArea= " + surfaceArea +
                ", volume= " + volume +
                '}';
    }
}
