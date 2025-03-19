package programmers.lessens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution12933 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        long answer = solution1.solution(864432);
        System.out.println(answer);
    }

}

class Solution1 {

    public long solution(long n) {
        List<Long> longlist = new ArrayList<>();
        while (n > 0) {
            longlist.add(n % 10);
            n /= 10;
        }
        longlist.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (long a : longlist) {
            sb.append(a);
        }

        return Long.parseLong(sb.toString());

    }
}
