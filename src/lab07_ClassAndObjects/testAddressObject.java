package lab07_ClassAndObjects;

public class testAddressObject {
    public static void main(String[] args) {
        Address address1= new Address();
        Address address2= new Address();
        Address address= new Address();
        address1.setInfo("10826","Carmel Mountain Rd","San Diego", "CA", "92129");

        System.out.println(address1);
    }
}
