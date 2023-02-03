package day18_garbageCollection.PracticeTasks;

public class ContactObjectTest {
    public static void main(String[] args) {
        Contact person1 = new Contact("Ali", "98789990", "ali@gmail.com" );

        System.out.println(person1);

        System.out.println("---------------------------------------------------------------");


        Carpet carpet1= new Carpet();
        carpet1.setInfo(12, 15, 4, true);

        System.out.println(carpet1);
    }
}
