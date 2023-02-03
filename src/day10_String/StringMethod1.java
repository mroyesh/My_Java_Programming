package day10_String;

public class StringMethod1 {
    public static void main(String[] args) {

        String str="happy new Tuesday";
        char ind = str.charAt(4);

        char type= str.charAt(7);
     System.out.println("the last char is "  + type );
        System.out.println(ind);


       String str1 = "Cydeo";
       char firstChar= str1.charAt(0);
       char secondChar = str1.charAt(1);
       char thirdChar = str1.charAt(2);
        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
        int length = str1.length();
        System.out.println(length);
        int lastIndex = length-1;
        System.out.println("Last index:= " +lastIndex);

        String str2= new String("happy new year");
        char fChar= str2.charAt(0);
        System.out.println(fChar);
        int length1 = str2.length();
        System.out.println(length1);
        int lastInd =length-1;
        System.out.println(lastInd);
        char l= str2.charAt(lastInd);
        System.out.println(fChar + ":" + l);
        int indexOff= str2.indexOf("year");
        System.out.println(indexOff);

        String name1 = "Alidad";
        String name2 = new String("Alidad");
        System.out.println(name1.equals(name2));

        String s2= "Java";
        String s3= "Java";
        String s4 = "java";
        System.out.println(s2.equals(s3));

        String str3 = "Cydeo";
        // index:    0123456789
        char firstChar1 = str.charAt(0);
        char secondChar1 = str.charAt(1);
        char thirdChar1 = str3.charAt(2);
        System.out.println("FirstChar= : "+firstChar1);
        System.out.println("secondChar = " + secondChar1);
        System.out.println("thirdChar1 = " + thirdChar1);

        System.out.println("--------------------");

        String sentences = "java programming language";
        int length2 = sentences.length();
        System.out.println(length2);
        int lastIndex1 =length-1;
        System.out.println(lastIndex1);
        System.out.println("----------------");
    }
}
