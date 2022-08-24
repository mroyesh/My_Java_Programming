package day27_accessModifier.TaskSolutions;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public String batchNumber;
    public String groupNumber;
    public String ProgrammingLanguage;
    public static String  schoolName, fieldOfStudy,programmingLanguage, secretCode;

    public CydeoStudent(String name, char gender, int age, String batchNumber,
                        String groupNumber, String programmingLanguage) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        ProgrammingLanguage = programmingLanguage;
    }

    static {
        schoolName= "Cydeo School";
        fieldOfStudy="Java zero to Hero";

        secretCode="success";
    }
    public static void SchoolName(){
        System.out.println("School name is: "+ schoolName);
    }
    public static void PrintSecretCode(){
        System.out.println("secret code is: "+secretCode);
    }
    public void  attendClass(){
        System.out.println(name+ "is attending class");
    }
    public void study(){
        System.out.println(name+" is studying Java");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", ProgrammingLanguage='" + ProgrammingLanguage + '\'' +
                '}';
    }
}



