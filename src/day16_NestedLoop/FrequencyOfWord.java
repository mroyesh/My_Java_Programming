package day16_NestedLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = " JavA JAVa java Java java java java";
        String word = "Java";
        str = str.toLowerCase();
        word = word.toLowerCase();
        int count = 0;
        while (str.contains(word)) {
            count++;
           str = str.replaceFirst(word,"");// every java word will be removed and added to count one number
        }
        System.out.println(count);
    }
}
