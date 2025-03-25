package programmers.lessens;


import java.util.Arrays;

public class Solution12910 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int [] arr = solution5.solution(new int[]{3,2,6},10);
        System.out.println(Arrays.toString(arr));
    }
}
class Solution5{
    public int[] solution(int[] arr, int divisor){
      int [] answer = Arrays.stream(arr)
              .filter(n -> n % divisor == 0)
              .sorted()
              .toArray();

        if(answer.length == 0){
            answer = new int[]{-1};
        }
       return answer;
    }
}
