package day08_ternaries_switch;

public class IfStatementAndTernaryPractice {
    public static void main(String[] args) {
        int num = 9;
        String month = (num >= 1 && num <= 12) ?
                (num == 1) ? "Jan" : (num == 2) ? "Feb" : (num == 3) ? "March" : (num == 4) ? "April" : (num == 5) ?
                        "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "Sep"
                        : (num == 10) ? "Oct" : (num == 11) ? "Nov" : "Dec" : "Invalid";
        System.out.println(month);
        int score = 68;
        String result = "";
        if (score >= 0 & score <= 100) {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        } else
            result = "Invalid Score";
        System.out.println(result);


        System.out.println("-----------------");

        //String result2 = (score >=0 && score <=100)?;*/

        int day = 6;
        String result1 = (day >= 1 && day <= 2) ?
                (day == 1) ? "great" : "bad day"
                : "Not a valid day";
        System.out.println(result1);

        int x = 10;
        int y = 22;
        System.out.println();

    }
}
