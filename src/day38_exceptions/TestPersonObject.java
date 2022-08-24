package day38_exceptions;

public class TestPersonObject {

    public static void main(String[] args) {
        Person person1= new Person("Ali", 24, 'M');
        Person person2= new Person("Hadi", 23, 'F');

        System.out.println(person1);
        try{
            person2.setAge(-300);
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            System.out.println("end of the coding");
        }


        System.out.println(person2);
    }
}
