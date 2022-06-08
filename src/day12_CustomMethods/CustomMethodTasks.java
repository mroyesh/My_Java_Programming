package day12_CustomMethods;

public class CustomMethodTasks {
    public static void main(String[] args) {
        MaxAndMinNum(4999, 6000);

        System.out.println("-------------");

        MaxAndMinNum(15000, 16000);

        System.out.println("--------------");

        MaxAndMinNum(12, 3000);

        inatial("Yasin","Esmat");


    }
    public static void MaxAndMinNum(int num1, int num2){
        if(num1>num2){
            System.out.println(num1+" is larger");
        }else if(num1<num2){
            System.out.println(num2+ " is the larger");
        }else{
            System.out.println(num1+ " = "+num2);
        }


    }
    public static void inatial(String fName, String lName){
        System.out.println("initial is "+ fName.substring(0,1)+ "."+ lName.substring(0,1));


    }
}
