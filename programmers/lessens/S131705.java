package programmers.lessens;

/**
 * 입출력 예
 * number : [-2, 3, 0, 2, -5]
 * result : 2
 */
public class S131705 {
    public static void main(String[] args) {
        Solution131705 solution = new Solution131705();

        int answer = solution.solution(new int[]{-2, 3, 0, 2, -5});

        System.out.println("answer = " + answer);
    }
}

class Solution131705 {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
