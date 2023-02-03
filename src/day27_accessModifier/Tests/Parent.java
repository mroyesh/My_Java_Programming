package day27_accessModifier.Tests;

public class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }    
    static {
        System.out.println("Parent static block");    
    }    
    {
        System.out.println("Parent initialisation  block");
    }

    public static void main(String[] args) {

        new Parent();
    }
}

