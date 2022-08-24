package day29_inheritance.TaskSolutions;


public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String id, String jobTitle, char gender, int age, double salary) {
        super(name, id, jobTitle, gender, age, salary);
        this.setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }





    /*public Developer(String name, String id, String jobTitle, char gender, int age, double salary, String programmingLanguage) {
        super(name, id, jobTitle, gender, age, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        if(! (programmingLanguage.equals("Java")|| programmingLanguage.equals("JavaScript")|| programmingLanguage.equals("Python")
        || programmingLanguage.equals("C#")|| programmingLanguage.equals("Ruby")||programmingLanguage.equals("C++")||
        programmingLanguage.equals("Swift"))){
            System.out.println("Invalid Programming language");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

     */

    public void coding(){
        System.out.println(getName()+ " is writing codes most of the time");


    }




}



