package day30_inheritance.PhoneTask;

public class TestPhoneObject {
    public static void main(String[] args) {


        IPhone iPhone = new IPhone("Iphone 12", "large", "Silver", 1299);

        Samsung samsung = new Samsung(" Galaxy s22", "large", "White", 1149);
        Nokia lumia = new Nokia("Brick", "Medium", "White", 999);

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(lumia);


        System.out.println("----------------------------------------------");


        iPhone.call(911);
        samsung.call(911);
        lumia.call(911);

        iPhone.faceTime(123343221);
        lumia.selfDefence();
        samsung.freeze();


    }






}
