package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str= "20";
        Integer number= Integer.parseInt(str);
        System.out.println(number+12);

        System.out.println(str+1);

        System.out.println(str+20);
        System.out.println(str);

        System.out.println("--------------------------12");

        Integer n2= Integer.parseInt(str);
        int num1=Integer.parseInt(str);

        System.out.println(num1);
        Integer num2= Integer.valueOf(str);
        System.out.println("This is number 2: "+num2);

        System.out.println("------------------------------");

        String s= "20.5";
        double num3= Double.parseDouble(s);
        Double num4= Double.valueOf(s);

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        System.out.println("---------------------------------");


        String x= "true";
        boolean b1= Boolean.parseBoolean(x);
        System.out.println(b1);

        Boolean b2= Boolean.valueOf(x);
        System.out.println(b2);

        System.out.println("--------------------------------------");

        char ch='1';

        boolean isDigits = Character.isDigit(ch);
        System.out.println(isDigits);

        boolean isLetter = Character.isLetter(ch);
        System.out.println(isLetter);

        boolean isLetters = Character.isLetter(ch);
        System.out.println(isLetters);

        boolean isLowerCase = Character.isLowerCase(ch);
        System.out.println(isLowerCase);

        boolean isUpper = Character.isUpperCase(ch);
        System.out.println(isUpper);

        boolean SpecialChar = !Character.isLetterOrDigit(ch);
        System.out.println("SpecialChar = " + SpecialChar);


        System.out.println("-----------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;
        for( char each: string.toCharArray()){
            if(Character.isLetter(each)){

            }
        }
        System.out.println(sum);

        System.out.println("================================================");

        for (char each : string.toCharArray()) {
            if ( Character.isDigit(each) ) {
                sum ++; Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);

        String str2="";
        for (char each2: string.toCharArray()){
            if(Character.isLetter(each2)){
                str2+=each2;


            }
        }
        System.out.println(str);

        char ch1 = '$';

        boolean isdDigits= Character.isDigit(ch);

        boolean isLitter= Character.isLetter(ch);

        boolean isLowerCase1= Character.isLowerCase(ch);

        boolean isUpperCase= Character.isUpperCase(ch);

        boolean isSpecialChar= !Character.isLetterOrDigit(ch);

        System.out.println("isdDigits = " + isdDigits);

        System.out.println("isLitter = " + isLitter);

        System.out.println("isLowerCase = " + isLowerCase);

        System.out.println("isUpperCase = " + isUpperCase);

        System.out.println("isSpecialChar = " + isSpecialChar);


        System.out.println("-------------------------------------");


        String str3= "a1b2c3d4e5";
        int sum1= 0;
        for(char each:str3.toCharArray() ){
        if(Character.isDigit(each)){
            sum+= Integer.parseInt(""+each);
        }
        }
        System.out.println("sum = " + sum1);


    }
}
