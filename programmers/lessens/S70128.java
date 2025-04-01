package programmers.lessens;

import java.util.stream.IntStream;

public class S70128 {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{-3, -1, 0, 2};
        System.out.println(solution12.solution(a,b));
    }
}
class Solution12 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}

//import java.util.stream.IntStream;

//class Solution {
//    public int solution(int[] a, int[] b) {
//        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
//    }
//}

