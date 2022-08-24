package day26_statics;

public class ConstructorCall {

    public ConstructorCall(){
        System.out.println("default constructor ");

    }
    public ConstructorCall(double b){
        System.out.println("constructor with double argument");
    }
    public ConstructorCall(int a){
        this();
        System.out.println("constructor with int argument");

    }


    public static void method1(){
        System.out.println("Method1");
    }
    public static void method2(){
        method1();
        System.out.println("Method2");
    }

}
