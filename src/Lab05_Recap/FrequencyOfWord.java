package Lab05_Recap;

public class FrequencyOfWord {
    public static void main(String[] args) {


        String sentence = "Java Java Java Java python C# Ruby";
        int original_length= sentence.length();
        String temp = sentence;
        temp= sentence.replace("Java","aaa");
        System.out.println();
        int new_length= temp.length();
        System.out.println(original_length);
        System.out.println(new_length);
        int totalNumberOfJava = original_length-new_length;
        System.out.println(totalNumberOfJava);
        // this is one way to find number of repeated word in a given string.

        System.out.println("-----------------------------");

        String str= " love love love love love java java java python python python";
        String temp1= str.replace("love","lll");
        int result= str.length()-temp1.length();
        System.out.println(result);

        System.out.println("^^^^^^^^^^^^^^^^^^^");

        String str2= "happy happy happy happy happy happy happy happy happy sad sad sad sad";
        String temp2= str2.replace("sa", "x");
        int totalNumberOfHappy= str2.length()-temp2.length();
        System.out.println("Total number of sa repeated in the given string = "+totalNumberOfHappy);


        System.out.println("-----------------------------------------");

        String a= "hard worker is the only way to be successful, without being hard worker it it impossible to be a successful person";
        String b= a.replace("hard worker", "aaabbbcccd");
        int result4= a.length()-b.length();
        System.out.println(result4);


        System.out.println("--------------------------------------");

        String ab= " happy happy poppy poppy copy copy copy ";
        String tep= ab.replace("copy", "xxx");
        int result3= ab.length()-tep.length();
        System.out.println(result3);











    }
}