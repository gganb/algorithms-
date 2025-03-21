package programmers.lessens;

public class Solution12943 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println("정답" + solution4.souluton(16));
    }
}
class Solution4{
    public int souluton(int num) {
        int answer = 0;
        long n = num;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            if (answer > 500) {
                answer = -1;
                break;
            }
            answer++;
        }
        return answer;
    }
}
