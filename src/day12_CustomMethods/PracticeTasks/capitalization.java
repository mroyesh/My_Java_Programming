package day12_CustomMethods.PracticeTasks;

public class capitalization {
    public static void main(String[] args) {

        capitalization("yasin", "tawasulli");

    }

    public static void capitalization(String FName, String LName){
        FName= FName.substring(0,1).toUpperCase()+FName.substring(1).toLowerCase();
        LName= LName.substring(0,1).toUpperCase()+LName.substring(1).toLowerCase();
        System.out.println(FName+" " +LName);

    }
}
