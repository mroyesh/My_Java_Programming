package day27_accessModifier;

public class Car {   // outer class
    public String make, model, color;
    public int year;
    public double price;

    public static int wheels= 4;

    public class CarEngine{  // inner clsass

        public void method(){

            System.out.println(make);
            System.out.println(wheels);

        }

    }

    public static class StaticInnerClass{
        public void method(){
            System.out.println(wheels);
        }

    }
}
