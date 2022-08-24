package day17_CustomClass;

public class FindUniqueCharactors1 {
    public static void main(String[] args) {

        //write a method that returns a unique
        String str=" aabcccd";
        String unique= "";
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                unique+=ch;
            }
        }
        System.out.println(unique);


        String str1= "aabbbssasss";
        String result= "";
        for (int i = 0; i < str1.length(); i++) {
            char ch= str1.charAt(i);

            int count= 0;

            for (int j = 0; j < str1.length(); j++) {

                if(str1.charAt(j)==ch){
                    count++;
                }

                }
            if(result.contains(""+ch)){
                continue;
            }
            result+=ch+""+count;

        }
        System.out.println(result);



    }
}
/*
 write a program that can find the unique characters from a string
            Ex: str = "aabcccd";
            output: ===> bd
 */