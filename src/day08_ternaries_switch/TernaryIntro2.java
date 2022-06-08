package day08_ternaries_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {

        /*int n=1;
        String day = (n ==1)? "Monday" : (n==2)? "Tuesday":(n==3)?"Wednesday"
                :(n==4)?"Thursday":(n==5)?"Friday":(n==5)?"Saturday " : "Sunday";
        System.out.println(day);
        System.out.println("------------------------------");*/

        int n = 10;//1-12;
        String month = (n == 1)? "January":(n==2)?"February":(n==3)?"March"
                :(n==4)?"April":(n==5)?"May":(n==6)?"June":(n==7)?
                "July":(n==8)?"August":(n==9)?"September":(n==10)?
                "October" :"December";
        System.out.println(month);


    }
}
