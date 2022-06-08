package day15_WhileLoop;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String a = " Happy new year all friends";
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if ( b.contains("" + a.charAt(i)) ) {
                continue;
            }
            b += a.charAt(i);
        }
        System.out.println(b);




        /*String str = "aabbbcccc";
        String result = "";// should contain abc
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if ( !result.contains("" + each) ) {
                result += each;
            }
        }
            System.out.println("result = " + result);

        System.out.println("_______________;;;;;;;;;;;;;;;;");

        String str1 = "djskajfiedkfjkjfhhfhfhkdfdhf";
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            if ( result.contains("" + str1.charAt(i)) ) {
                continue;
            }
            result += str1.charAt(i);
        }
        System.out.print(result);

        System.out.println("-------____---------------_____-______--__-");

        String nu= "1232njwejje53442";
        String result1= "";
        for (int i = 0; i <nu.length() ; i++) {
            if(result.contains(""+nu.charAt(i))){
                continue;
            }

        }
    }
}

Write a program that can remove the duplicated characters from the string
                Ex:
                    str = "aabbbcccc"
                    output:
                        abc*/
    }

}