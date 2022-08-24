package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar {

    public static void main(String[] args) {
        String str = "aabcccaaaaa";

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            //if ( frequency == 1 ) // unique char
                map.put(each, frequency);

            }
            System.out.println(map);
        }
    }

/*
1. Write a program that can return the frequency of characters
            Not: MUST use map
                Ex: str = "bbcccaaaaa"
                output:
                    {b=2, c=3, a=5}
 */
