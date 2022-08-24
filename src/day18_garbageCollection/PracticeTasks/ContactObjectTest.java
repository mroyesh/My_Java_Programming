package day18_garbageCollection.PracticeTasks;

public class ContactObjectTest {
    public static void main(String[] args) {
        Contact person1 = new Contact();
        person1.setInfo("Ali", "6291233211","ali_attest@gmail.com");

        System.out.println(person1);


        System.out.println("---------------------------------------------------------------");


        Carpet carpet1= new Carpet();
        carpet1.setInfo(12, 15, 4, true);

        System.out.println(carpet1);
    }
}
