package day28_encapsulation.Encopsulation;

public class Student {

    private  String name;
    private int age;

    public String getName() {
        if(name==null){
            System.err.println("name has not been set");
            System.exit(1);
        }

        return name;
    }

    public void setName(String name) {

        boolean hasDigits= false;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age==0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        if(age < 1 || age> 100){ // if age is invalid
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age=age;



    }

}
