package Lab05_Recap;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String a= "abcabcabcbabcjjshjhj";
        String b= "";
        for (int i = 0; i <a.length() ; i++) {
            char ch= a.charAt(i);
            if ( !(b.contains(""+ch)) ){
                b+=ch;
            }
        }
        System.out.println(b);






        String str = " xyzxyzxyzyxzyxyzxyyyzyxyyyxy";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            //if(result.indexOf(each)<0){
            if ( !result.contains("" + each) ) {  // before adding characters to new string ,we check if the character is not included in the string
                result += each;

            }
        }
        System.out.println(result);



        String input= "abcabbdacca";
        String output="";
        for (int i = 0; i >input.length() ; i++) {
            char ch= input.charAt(i);
            if(!(output.contains(""+ch))){
                output+=ch;
            }


        }
        System.out.println("output of the given string is: "+output);
    }
}