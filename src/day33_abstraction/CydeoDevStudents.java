package day33_abstraction;

import day32_finalKeyword.PersonTask.Person;

import java.time.LocalDate;

public class CydeoDevStudents  extends Person {
    private final String id;
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage;

    static {
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setBatchNumber(int batchNumber) {
        if ( batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev") ) {

            this.batchNumber = batchNumber;
        } else {
            System.out.println(" invalid batch name");
            System.exit(1);
        }
    }

    public CydeoDevStudents(String name, char gender, int age,
                            LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, age, dateOfBirth);
            System.out.println("student must be at least 18");
            System.exit(1);
            this.id = id;
            this.batchName = batchName;
            this.batchNumber = batchNumber;


        }
        @Override
        public void eat(){
            System.out.println(getName()+ " is eating "+ programmingLanguage);

        }
        @Override
        public void drink(){
            System.out.println(getName()+" is drinking "+ programmingLanguage);

        }

        public void sleep(){
            System.out.println(getName()+" is not sleeping");
        }

    @Override
    public String toString() {
        return super.toString()+ "{" +
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}


