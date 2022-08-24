package day27_accessModifier;

public class StaticBlock_Vs_instanceBlock_vS_Constructor {

    public StaticBlock_Vs_instanceBlock_vS_Constructor(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        new StaticBlock_Vs_instanceBlock_vS_Constructor();

    }


}
