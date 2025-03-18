package programmers.lessens;

public class Solution12934 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = solution.solution(1);

    }
}

class Solution {
    public long solution(long n) {
        if (n == (long) Math.pow((int) Math.sqrt(n), 2))
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        else return -1;
    }
}