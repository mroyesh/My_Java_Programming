package lab06_CustomMethod;

public class CustomMethodPractice2 {
    public static void main(String[] args) {
        String result1 = ComboString("Hello", "Hi");
        System.out.println(result1);

        System.out.println("------------------------");
        System.out.println(left2("java"));

        System.out.println("------------------");
        String result3 = right2("Happy");
        System.out.println(result3);

        System.out.println("-----------------");

        boolean falseTrue=frontAgain("happy");
        System.out.println(" this is a test to make sure it works"+falseTrue);

        System.out.println("-----------------------");

        System.out.println("'-------------------------------");

        int countHi=countHi("hi hi hi hi hi hi hi hello hello hello Hello");
        System.out.println(countHi);


        boolean result =catDog("catdogdogcat");
        System.out.println(result);

        System.out.println("-------------------");

    }

    public static String ComboString(String a, String b) {
        if ( a.length() > b.length() ) {
            return b + a + b;
        } else if ( b.length() > a.length() ) {
            return a + b + a;
        } else {
            return a + b;
        }
    }

    public static String left2(String str2) {
        if ( str2.length() <= 2 ) {
            return str2;
        }
        String s1 = str2.substring(0, 2);
        String s2 = str2.substring(2);
        return s2 + s1;
    }

    public static String right2(String str3) {
        if ( str3.length() < 3 ) {
            return str3;
        }
        String s3 = str3.substring(str3.length() - 2);
        String s4 = str3.substring(0, str3.length() - 2);
        return s3 + s4;

    }


    public static boolean frontAgain(String str) {
        if( str.length() < 2 ) {
            return false;
        }
        String firstTwoChar = str.substring(0, 2);
        String lastTwoChar = str.substring(str.length() - 2);
        return firstTwoChar.equals(lastTwoChar);
        //return str.substring(0,2).equals(str.substring(str.length()-2));?? this is another solution.
    }

    // Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
    //frontAgain("edited") → true frontAgain("edit") → false frontAgain("ed") → true

    public static int countHi(String str){
        return StringUtility.frequency(str, "Hi");
    }



    public static boolean catDog(String str) {
        int countCat = StringUtility.frequency(str, "cat");
        int countDog = StringUtility.frequency(str, "dog");
        return countDog == countCat;

    }


}
