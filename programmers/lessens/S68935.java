package programmers.lessens;

public class S68935 {
    public static void main(String[] args) {
        Solution15 solution = new Solution15();
        int answer = solution.solution(45);
        System.out.println("10진법 -> 3진법 -> 10진법 : " + answer);
    }

}

class Solution15 {
    public int solution(int n) {
//        String answer = "";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
//            answer += n % 3;
            n /= 3;
        }
        return Integer.parseInt(sb.toString(), 3);
    }
}
