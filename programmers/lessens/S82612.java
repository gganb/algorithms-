package programmers.lessens;

public class S82612 {
    public static void main(String[] args) {
        Solution14 s = new Solution14();
        System.out.println(s.solution(3,20,4));
        System.out.println();
    }
}
class Solution14 {
    public long solution(int price, int money, int count) {

        long answer = 0;

        for(int i = 1; i <= count; i++){
            answer += price * i;
        }

        if(money < answer){
            answer -= money;
        } else answer = 0;

        return answer;
    }
}