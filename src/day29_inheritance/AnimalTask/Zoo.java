package day29_inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args){

    Dog dog = new Dog();
    dog.setInfo("Max", "Husky", 'M', 4, "size","Black" );




    Tiger tiger1 = new Tiger();
    tiger1.setInfo("Himalia","Himalyan",'F', 12 , "Big", "black");


        System.out.println(dog);

        System.out.println(tiger1);


        System.out.println("-------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        System.out.println("--------------------------------");



        System.out.println("--------------------------------");

        tiger1.hunt();
        tiger1.eat();
        tiger1.sleep();

        System.out.println("---------------------------------");

        dog.bark();

        tiger1.hunt();

}
}
