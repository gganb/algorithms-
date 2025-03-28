package programmers.lessens;

public class Solution86051 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.solution(new int[]{5,8,4,0,6,7,9}));
    }
}
class Solution8 {
    public int solution(int[] numbers) {
        int answer = 45;

        for(int i : numbers){
            answer -= i;
        }
        return answer;
    }
}