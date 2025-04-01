package programmers.lessens;

public class S77884 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int solution = solution11.solution(13, 17);
        System.out.println(solution);
    }
}
class Solution11 {
    public int solution(int left, int right) {

        int answer = 0;
        for(int i = left; i <= right; i++){
            int sqrt = (int)Math.sqrt(i);
          if(sqrt * sqrt == i){
              answer -= i;
          }else answer += i;
        }

        return answer;
    }
}
