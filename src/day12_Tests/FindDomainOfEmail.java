package day12_Tests;

public class FindDomainOfEmail {
    public static void main(String[] args) {
        EmailDomain("cbrown@sdccd.edu");

    }

    public static void EmailDomain(String email){
        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(domain);



        /*
        Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
         */
    }
}
