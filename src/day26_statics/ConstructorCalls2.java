package day26_statics;

public class ConstructorCalls2 {
    public ConstructorCalls2(){
        System.out.println("with default argument");

    }
    public ConstructorCalls2(int a){
        this();
        System.out.println("with int argument");
    }
    public ConstructorCalls2(double b){
        this(12);
        System.out.println("with double arguments");
    }

    public ConstructorCalls2(String c){
        this(2.4);
        System.out.println("with string");
    }

    public static void main(String[] args) {
        ConstructorCalls2 object1= new ConstructorCalls2();


        System.out.println("--------------------------------");


        ConstructorCalls2 object2= new ConstructorCalls2(12);

        System.out.println("----------------------------------");

        ConstructorCalls2 object3= new ConstructorCalls2(2.5);
    }

}
