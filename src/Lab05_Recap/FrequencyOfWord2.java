package Lab05_Recap;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentences = "java java java java python C# Rudy java java";
        int countJava = 0;
        // while(sentences.indexOf("java">0)){  // java is exist in the given string                     // inside a while we place condition
        while (sentences.contains("java")) {  // while the sentences has java
            sentences = sentences.replaceFirst("java", ""); // remove one java at a time
            countJava++;
        }
        System.out.println(countJava);


        System.out.println("---------------------------");

        String pot= " hi hi hi hi hi hi hi hello hello hello";
        String plate=pot.replace("hi","x");
        int result= pot.length()-plate.length();
        System.out.println(result);




    }

}
