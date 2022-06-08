package lab06_CustomMethod;

public class CustomMethodPractice {
    public static void main(String[] args) {
        String str = helloName("Ali");
        System.out.println(str);
        //System.out.println(helloName("ali"));

        System.out.println("--------------------------");
        System.out.println(makeAbba("Hi", "bye"));


        System.out.println("--------------------");

        System.out.println(extraEnd("hello"));

        System.out.println("-------------------------");

        String result1 = firstTwo("Hello");
        System.out.println("this is the result of  first 2 "+result1);

        System.out.println("----------------------");

        System.out.println(withoutLast("Hello"));
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }


    public static String makeAbba(String a, String b) {
        //
        //String result = ""; // we can declair directly like below
        String result =a+b+b+a;
        //result += b;
        //result += b;
       // result += a;
        return result;
    }

   public static String extraEnd(String str) {
        if ( str.length() < 2 ) {
            return str;
        }
        String substring = str.substring(str.length() - 2);
        String result = substring.repeat(3);
        return result;
        //return str.substring(str.length()-2).repeat(3);  // this is another way to get the result
    }

    public static String firstTwo(String str1) {

        if ( str1.length() < 2 ) {
            return str1;
        }
            return str1.substring(0, 2);

        }
        public static String withoutLast(String str){
        if(str.length()>=3){
            return str.substring(1,str.length()-1);
        }else{
            return str;
        }
        }
    }

