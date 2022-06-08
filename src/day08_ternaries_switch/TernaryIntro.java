package day08_ternaries_switch;

public class TernaryIntro{
    public static void main(String[] args) {

        int score = 85;
        String result = "";
        if(score >= 60){
            result = "passed";
        }else{
            result= "Failed";
        }
        System.out.println(result);
        System.out.println("-------------");

        String result2 = (score >= 60)? "Passed" : "Faided";
        System.out.println(result2);

        int age = 23;
        String r="";
        if (age >= 21){
            r="Eligible";
        }else {
            r= " Not Eligible";
        }
        System.out.println(r);


        String reult3= "";
        String result3 = (age >= 21)? " Eligible" : "Not Eligible";
        System.out.println(result3);


    }
}

