package programmers.lessens;

import java.util.Arrays;
import java.util.Collections;

public class S12917 {
    public static void main(String[] args) {
        Solution13 s = new Solution13();
        System.out.println(s.solution("Zbcdefg"));
    }
}

class Solution13 {
    public String solution(String s) {

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();

        for (char c : ch) {
            sb.append(c);
        }
        sb.reverse();
        return sb.toString();

    }
}
