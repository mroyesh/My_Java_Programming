package day27_accessModifier;

public class AccessModifier {
    public  static int publicDate=200;

    public static void main(String[] args) {
        System.out.println(publicDate);

        System.out.println(protectedData);

        System.out.println(defaultData);

        System.out.println(privateData);// only accessible within same class
    }

    protected static int protectedData= 300;


    static int defaultData=400;


    private static int privateData= 500;



}
