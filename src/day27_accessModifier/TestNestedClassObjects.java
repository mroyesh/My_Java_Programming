package day27_accessModifier;

public class TestNestedClassObjects {
    public static void main(String[] args) {


        Car obj1= new Car();
        Car.CarEngine object2=obj1.new  CarEngine();

        obj1.new CarEngine();

          Car.StaticInnerClass obj3= new Car.StaticInnerClass();



    }
}
