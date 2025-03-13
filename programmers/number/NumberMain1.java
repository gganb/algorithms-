package programmers.number;

import java.util.Arrays;

public class NumberMain1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(-4,2)));

    }
}
class Solution{
    public long[] solution(int x, int n){
        long[] arr = new long[n];
        arr[0] = x;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1] + x;
        }
        return arr;
    }
}