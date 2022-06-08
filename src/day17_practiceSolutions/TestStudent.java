package day17_practiceSolutions;

public class TestStudent {
    public static void main(String[] args) {

        Student studentA= new Student();
        studentA.setInfo("Ali",'M', 32, "CSID123",'A', false);

        Student studentB = new Student();
        studentB.setInfo("Khalida", 'F', 23, "CSID4321",'B', !true);


        Student studentC= new Student();
        studentC.setInfo("Farida",'F', 20, "UDS3210", 'A',true);


        System.out.println("studentA = " + studentA);
        System.out.println("studentB = " + studentB);
        System.out.println("studentC = " + studentC);

        studentC.styde();

    }


}
