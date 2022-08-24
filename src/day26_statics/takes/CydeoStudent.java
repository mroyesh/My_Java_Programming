package day26_statics.takes;

public class CydeoStudent {
    public String name, grade, id;
    public int age, batchNumber, groupNumber;
    public char gender;
    public static  String SchoolName="Cyedo", magicWord= "Success";
    public static String ProLanguage= "java developer";


    public CydeoStudent(String name, String grade, String id, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.grade = grade;
        this.id = id;
        this.age = age;
        this.gender= gender;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }


    public void study(){
        System.out.println(name+"is studying");
    }
    public void SchoolName(){
        System.out.println("SchoolName = " + SchoolName);



    }
    public void ProLanguage(){
        System.out.println("ProLanguage = " + ProLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                '}';
    }
}

