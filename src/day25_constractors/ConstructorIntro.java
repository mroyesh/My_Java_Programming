package day25_constractors;

public class ConstructorIntro {


    public ConstructorIntro(){
        System.out.println("Object is created by using no argument constructor");

    }
    public ConstructorIntro(int a){
        System.out.println("Objects is created by using int argument constructor");
    }



    public static void main(String[] args) {
    ConstructorIntro obj1=new ConstructorIntro(12);
    ConstructorIntro obj2= new ConstructorIntro();
    ConstructorIntro obj3= new ConstructorIntro();
    }


}
