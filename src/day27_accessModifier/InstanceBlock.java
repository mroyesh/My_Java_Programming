package day27_accessModifier;

public class InstanceBlock {
    {// instance block runs first than constructor.
        System.out.println("Instance Block");
    }


    public InstanceBlock(){
        System.out.println("This is instance block");

    }


    public static void main(String[] args) {
        new InstanceBlock();
        System.out.println("main method");
    }
}
