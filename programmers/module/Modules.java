package programmers.module;

import java.util.Scanner;

/*
 * 자연수 n이 매개변수로 주어집니다.
 * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 리턴하도록
 * solution함수를 완성해주세요.
 * 3 <= n <= 1000000
 *
 * */
public class Modules {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Solution solution = new Solution();
        int answer = solution.solution(n);

        System.out.println(answer);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
