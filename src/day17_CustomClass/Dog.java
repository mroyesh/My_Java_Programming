package day17_CustomClass;

public class Dog {
    public String name;  // instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setInfo(String name, String breed, String size,char gender,
                        int age,String color){
        this.name= name;
        this.breed=breed;
        this.size=size;
        this.gender=gender;
        this.age=age;
        this.color=color;
    }
    public void eat(){ //instance methods  ==> means can store its own data
        System.out.println(name+  "is eating dog food");
    }
    public void drink(){
        System.out.println(name+" is drinking water");
    }
    public void run(){
        System.out.println(name +" is running fast");
    }

    public String toString() { // to avoid getting hash-codes when printing on the counsel.
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }



}
