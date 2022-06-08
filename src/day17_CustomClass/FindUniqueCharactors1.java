package day17_CustomClass;

public class FindUniqueCharactors1 {
    public static void main(String[] args) {
        String str=" aabcccd";
        String unique= "";
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                unique+=ch;
            }
        }
        System.out.println(unique);



    }
}
/*
 write a program that can find the unique characters from a string
            Ex: str = "aabcccd";
            output: ===> bd
 */