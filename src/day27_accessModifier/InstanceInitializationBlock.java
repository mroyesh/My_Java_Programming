package day27_accessModifier;

import java.util.Arrays;
import java.util.List;

public class InstanceInitializationBlock {

    public String name;
    public int age;
   /* {
        name= "James";  // this is when we use it as default.
        age = 20;

    }*/

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("Ali", 25);
        InstanceInitializationBlock obj2= new InstanceInitializationBlock("hadi", 56);
        System.out.println(obj1.name);

        System.out.println(obj2.name);
    }

}
