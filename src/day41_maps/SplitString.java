package day41_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SplitString {
    public static void main(String[] args) {
       /* String str= "bbcccaaaaa";
        String[] str1= str.split("");
        System.out.println(Arrays.toString(str1));

        ArrayList<String>str2= new ArrayList<>();
        str2.addAll(Arrays.asList(str1));
        System.out.println(str2);*/

        System.out.println("---------------------------------------------");
        String str= "bbcccaaaaa";

        HashMap<Character, Integer>hasMap= new HashMap<>();
        char[] strArray= str.toCharArray();

        for( char each: strArray){
            if(hasMap.containsKey(each)){
                hasMap.put(each, hasMap.get(each)+1);
            }else{
                hasMap.put(each,1);
                for(Map.Entry entry: hasMap.entrySet()){
                    System.out.print(entry.getKey()+""+entry.getValue());
                }
            }
        }
    }
}
