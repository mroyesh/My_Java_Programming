package day18_garbageCollection.PracticeTasks;

public class OfferObjectTest {
    public static void main(String[] args) {
        Offer job1 = new Offer();

        job1.setInfo("Intel", "Java Developer", 120000, true, true, false, true);

        System.out.println(job1);
    }
}