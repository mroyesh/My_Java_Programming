package day18_garbageCollection;


public class MemoryAllocation {
    public static void main(String[] args) {

        String str = "java";
        String str6="java";
        boolean result= str==str6;
        System.out.println(result);

        String str2 = new String("java");
        String str3 = new String("java");
        boolean str4 = str2 == str3;
        System.out.println(str4);

        boolean str5= str==str2;
        System.out.println(str5);


    }


}
