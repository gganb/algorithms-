package programmers.foodfighter;

/*
*  배열 양쪽 0을 기준으로 대치시키기.
*   예시)
* 입력 : 1,7,1,2  출력 : 111303111
*
* */
public class FoodFighter {
    public static void main(String[] args) {
        int[] food = {1, 3, 5, 6, 7};
        Solution solution = new Solution();
        String answer = solution.solution(food);
        System.out.println(answer);
    }

}

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            sb.append(String.valueOf(i).repeat(cnt));
        }
        String answer = sb + "0";
        answer += sb.reverse();

        return answer;
    }

}
