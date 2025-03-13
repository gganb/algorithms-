package programmers.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumberMain2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(Arrays.toString(solution.solution(12345)));
    }
}

class Solution2{
    public int[] solution(long n){
        List<Long> arrList = new ArrayList<>();
        while(n>0){
            arrList.add(n%10);
            n = n /10;
        }

        return arrList.stream().mapToInt(Long::intValue).toArray();
    }
}
