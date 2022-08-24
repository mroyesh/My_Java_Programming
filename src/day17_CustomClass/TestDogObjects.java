package day17_CustomClass;

public class TestDogObjects {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.name="Max";
        dog1.breed="Husky";
        dog1.gender='M';
        dog1.age=4;
        dog1.color="white";

        //System.out.println(dog1.age);

        //dog1.eat();
       // System.out.println(dog1);

        dog1.run();

        Dog dog2= new Dog();
        dog2.name="Lucy";
        dog2.breed= " GermanShepherd";
        dog2.gender='F';
        dog1.age= 4;
        dog2.color="Gray";

        Dog dog3= new Dog();
        dog3.setInfo("lucky", "puppy","Medium",
                'F', 4,"brown");
        Dog dog4= new Dog();
            dog4.setInfo("Danial","chuvavi","large"
                    ,'F',6,"brown");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);


    }
}
