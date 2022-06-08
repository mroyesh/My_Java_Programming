package lab06_CustomMethod;

import Utilities.StringUtilityForMySelf;

public class CustomMethodpractice3 {
    public static void main(String[] args) {


        System.out.println(doubleChar("the"));


        System.out.println("------------------------------");


        System.out.println("the word ends with ly is = " + endsLy("friendly"));

        System.out.println("-------------------------------");

        System.out.println(hasBad("abad day always happen even in a very best day too"));

        System.out.println("--------------------------------");

        System.out.println(atFirst("x"));

        System.out.println("------------------------");

        System.out.println(isPalendrome("racecar"));

        System.out.println("'''''''''''''''''''''''''''''''''''''''");


    }


    public static String doubleChar(String str) {  //The ==>TThhee
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result += ch + ch;
        }
        return result;
    }


    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public static boolean hasBad(String str) {
        if ( str.equals("bad") ) {
            return true;
        } else if ( str.length() < 4 ) {
            return false;
        } else if ( str.substring(0, 3).equals("bad") ) {
            return true;
        } else if ( str.substring(1, 4).equals("bad") ) {
            return true;
        } else {
            return false;
        }
    }


    public static String atFirst(String str) {
        if ( str.isEmpty() ) {
            return "@@";
        }
        if ( str.length() == 1 ) {
            return str + "@";
        } else {
            return str.substring(0, 2);
        }
    }

    public static boolean isPalendrome(String str) {
        return StringUtility.reverse(str).equalsIgnoreCase(str);

    }
}

