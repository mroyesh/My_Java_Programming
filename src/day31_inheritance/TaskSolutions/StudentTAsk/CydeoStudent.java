package day31_inheritance.TaskSolutions.StudentTAsk;

public class CydeoStudent extends Student {
    private String programmingLanguage;
    private int batchNumber, groupNumber;

    public CydeoStudent(String name, int age, char gender, String studentID, String fieldOfStudy, char grade,
                        String SchoolName, int batchNumber, String programmingLanguage, int groupNumber) {
        super(name, age, gender, studentID, fieldOfStudy, grade, SchoolName);
        setBatchNumber(batchNumber);
        setProgrammingLanguage(programmingLanguage);
        setGroupNumber(groupNumber);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.out.println("Invalid batch number");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage.isEmpty()|| programmingLanguage==null){
            System.err.println("programming language can not set to empty");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber<=0){
            System.err.println("Invalid group number");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating during Cydeo class");
    }

    @Override
    public void drink() {
        System.out.println(getName()+ " is drinking coffee during class time");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", programmingLanguage ='" + programmingLanguage + '\'' +
                ", batchNumber =" + batchNumber +
                ", groupNumber =" + groupNumber +
                '}';
    }
}
