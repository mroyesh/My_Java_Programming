package lab07_ClassAndObjects;

public class Address {

    public String buildingNumber,street,city, state,zipcode;
    //public static String country="USA";


    public void setInfo(String buildingNumber, String street, String city, String state, String zipcode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    public String toString(){
        return buildingNumber+ " "+ street+ "\n"+city+ ", "+state+" "+zipcode;
    }
}
