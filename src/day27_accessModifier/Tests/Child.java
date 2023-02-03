package day27_accessModifier.Tests;

public class Child extends Parent {

    {
        System.out.println("parent instance block");
    }


    static {
        System.out.println("child static block");
    }

    public Child(){
        System.out.println("child constructor");
    }

    public static void main(String[] args) {
        new Child();
    }


}

