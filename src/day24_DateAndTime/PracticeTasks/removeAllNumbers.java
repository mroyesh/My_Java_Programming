package day24_DateAndTime.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeAllNumbers {
    public static void main(String[] args) {
        ArrayList<Character> ch = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        ch.removeIf(p->p.isDigit(p));
        System.out.println(ch);

    }
}
