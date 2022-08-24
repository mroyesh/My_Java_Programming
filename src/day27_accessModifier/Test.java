package day27_accessModifier;

public class Test {
    public static void main(String[] args) {

        //new StaticInitializationBlock();
        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("----------------------------");

        System.out.println(AccessModifier.publicDate);

        System.out.println(AccessModifier.protectedData);

        System.out.println(AccessModifier.defaultData);



    }
}
