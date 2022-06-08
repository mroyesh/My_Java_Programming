package Lab05_Recap;

public class Reverse {
    public static void main(String[] args) {
        String word = "Wooden Spoon";
        String reverse="";

        for (int i = word.length() - 1; i >= 0; i--) {    // use from the last initialization or last index number
                char each= word.charAt(i);   /// i: index number of string (word) starting from last index to 0.
                reverse+=each;    // gives is a reverse of string
        }

    }
}
