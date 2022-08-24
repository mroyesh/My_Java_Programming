package day24_DateAndTime.PracticeTasks;

import day17_CustomClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

        dogs[0].setInfo("Max", "Husky", "Medium", 'M', 4, "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 8, "Gold");
        dogs[2].setInfo("Molly", "Beagle", "Small", 'F', 2, "White");
        dogs[3].setInfo("Oliver", "Bulldog", "Small", 'M', 2, "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", "Small", 'F', 3, "White");
        dogs[5].setInfo("Loki", "Chow Chow", "Medium", 'M', 7, "Gold");

        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));

        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("Small"));
        System.out.println(smallDogs);

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(p -> p.age > 4);
        System.out.println(youngDogs);

        for (Dog dog : dogs) {
            if ( dog.age <= 4 ) {
                youngDogs.add(dog);
                System.out.println(smallDogs);

            }
        }

        ArrayList<Dog>femaleDog= new ArrayList<>(Arrays.asList(dogs));
        //femaleDog.removeIf(p->p.gender)


        ArrayList<Dog>maleDog= new ArrayList<>(Arrays.asList(dogs));



        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

        dogs[0].setInfo("Max", "Husky", "Medium", 'M', 4, "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 8, "Gold");
        dogs[2].setInfo("Molly", "Beagle", "Small", 'F', 2, "White");
        dogs[3].setInfo("Oliver", "Bulldog", "Small", 'M', 2, "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", "Small", 'F', 3, "White");
        dogs[5].setInfo("Loki", "Chow Chow", "Medium", 'M', 7, "Gold");


        ArrayList<Dog>list= new ArrayList<>(Arrays.asList(dogs2));
        list.removeIf(p->p.size.equalsIgnoreCase("small"));


        dogs2= list.toArray(new Dog[0]);
    }
}
