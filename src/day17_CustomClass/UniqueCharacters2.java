package day17_CustomClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {
        String str = "aabbbcccddd";
        String unique = "";
        for (int j = 0; j <str.length() ; j++) {

        char ch = str.charAt(j);// a==> frequency of the first character.==> index(0)
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if ( str.charAt(i) == ch ) {
                    frequency++;
                }
            }
            if ( frequency == 1 ) {
                unique += ch;
            }
        }
        System.out.println(unique);
    }
}