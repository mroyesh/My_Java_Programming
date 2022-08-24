package day11_Stringpart2.PracticeTasks;

public class EnterWords {
    public static void main(String[] args) {

        String email="yasin_royesh@gmail.com";

        String fName= email.substring(0,email.charAt('_'));
        String lName= email.substring('_'+1,email.indexOf('@'));
        String domain= email.substring('@'+1,email.indexOf('.'));
        // this is how we can find firstname, last name and domain
        // from a given email.

        System.out.println(fName);
        System.out.println(lName);
        System.out.println(domain);





    }
}
