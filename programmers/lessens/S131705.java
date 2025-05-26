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

        // 백트래킹 사용
        SolBacktracking back = new SolBacktracking();
        int answer2 = back.solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println("answer2 = " + answer2);
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

class SolBacktracking {
    /**
     * start : 인덱스 0부터 시작
     * depth : 아직 선택한 학생 수 x
     * sum : 현재까지 선택된 번호들의 합
     *
     * @param number 학생들의 번호 배열
     * @return
     */
    public int solution(int[] number) {
        return dfs(number, 0, 0, 0);
    }

    /**
     * @param number 학생들의 번호 배열
     * @param start  다음에 선택할 인덱스의 시작점 (이전보다 뒤쪽부터만 선택)
     * @param detph  지금까지 선택한 학생 수
     * @param sum    선택된 번호들의 합
     * @return
     */
    private int dfs(int[] number, int start, int detph, int sum) {
        if (detph == 3) {
            return sum == 0 ? 1 : 0;
        }

        int count = 0;

        /**
         * 백트래킹 루프
         * i부터 끝까지 반복
         * i + 1 : 중복 방지를 위해 다음 호출에서는 더 뒤에서만 선택
         * depth + 1 : 학생 한 명 추가 선택
         * sum + number[i] : 선택한 번호의 합 갱신
         */
        for (int i = start; i < number.length; i++) {
            count += dfs(number, i + 1, detph + 1, sum + number[i]);
        }

        return count;
    }
}
