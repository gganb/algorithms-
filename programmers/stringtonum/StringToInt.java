package programmers.stringtonum;

public class StringToInt {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("-1234"));
    }
}

class Solution{
    public int solution(String s){
        return Integer.parseInt(s);
    }
}
