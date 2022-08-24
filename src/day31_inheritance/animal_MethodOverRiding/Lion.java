package day31_inheritance.animal_MethodOverRiding;

public class Lion extends Animal{

    private String isAfricanLion;
    public Lion(String name, String breed, char gender, int age, String size, String color, String isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setIsAfricanLion(isAfricanLion);
    }

    public String getIsAfricanLion() {
        return isAfricanLion;
    }

    public void setIsAfricanLion(String isAfricanLion) {
        this.isAfricanLion = isAfricanLion;
    }

    @Override
    public void eat(){
        System.out.println("Lion "+ getName()+ " eats big and small animals");
    }

    @Override
    public String toString() {
        return super.toString().replace(" }", "")+
                "is African Lion ="+ isAfricanLion+ '\''+
                '}';
    }
}
