package lab07_ClassAndObjects;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public boolean isEmployed;
    public boolean isMarried;
    public String budgeNumber;
    public String programmingLanguage;
    public int groupNumber;

    public void setInfo(String name, int age, char gender
            , boolean isEmployed, boolean isMarried, String budgeNumber,
                        String programmingLanguage, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;
        this.isMarried = isMarried;
        this.budgeNumber = budgeNumber;
        this.programmingLanguage = programmingLanguage;
        this.groupNumber = groupNumber;

    }

    public void study() {
        System.out.println(name + " is studying " + programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isEmployed=" + isEmployed +
                ", isMarried=" + isMarried +
                ", budgeNumber='" + budgeNumber + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public void setInfo(String name, int age, char gender, String budgeNumber, String programmingLanguage, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.budgeNumber = budgeNumber;
        this.programmingLanguage = programmingLanguage;
        this.groupNumber = groupNumber;
    }
}
