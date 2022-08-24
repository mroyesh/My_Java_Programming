package day31_inheritance.animal_MethodOverRiding;

public class Eagle extends Animal {

    public String isStrongBird;

    public Eagle(String name, String breed, char gender, int age, String size, String color, String isStrongBird) {
        super(name, breed, gender, age, size, color);
        setIsStrongBird(isStrongBird);
    }

    public String getIsStrongBird() {
        return isStrongBird;
    }

    public void setIsStrongBird(String isStrongBird) {
        this.isStrongBird = isStrongBird;
    }

    @Override
    public void eat() {
        System.out.println(" Eagles "+ getName()+ " is  eating snake");
    }
}
