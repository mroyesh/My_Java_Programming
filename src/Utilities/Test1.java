package Utilities;
 import day27_accessModifier.AccessModifier;
 import day27_accessModifier.Data;
 import day27_accessModifier.Data;
public class Test1 {

    public static void main(String[] args) {
        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);


       int obj2=  AccessModifier.publicDate;   // test public access Modifier
        System.out.println(obj2);

        System.out.println("------------------------------");

        //int obj3= AccessModifier.protected); // protected is Not always accessible outside the package

        //System.out.println(AccessModifier.defaultDate);// default is not accessible outside of package




    }
}
