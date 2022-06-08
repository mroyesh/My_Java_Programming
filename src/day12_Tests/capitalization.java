package day12_Tests;

public class capitalization {
    public static void main(String[] args) {
        capilization("ali", "adili");

    }
    public static void capilization(String FName, String LName){
        String fn= FName.substring(0,1).toUpperCase()+FName.substring(1);
        String Ln= LName.substring(0,1).toUpperCase()+LName.substring(1);
        System.out.println(fn+ " "+Ln);
    }
}
