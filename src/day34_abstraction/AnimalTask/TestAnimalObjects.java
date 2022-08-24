package day34_abstraction.AnimalTask;

public class TestAnimalObjects {
    public static void main(String[] args) {
        Dolphin dolphin= new Dolphin("Kathi", "African", 'M',21, "Large", "Gray");

        System.out.println(dolphin);
        dolphin.play();
        dolphin.swim();
    }
}
