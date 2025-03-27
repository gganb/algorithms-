package programmers.lessens;


public class Solution76501 {
    public static void main(String[] args) {
       Solution6 solution6 = new Solution6();

       int num = solution6.solution(new int[]{4,7,4}, new boolean[]{true,false,true});
        System.out.println(num);
    }
}

class Solution6{
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for(int i = 0; i < signs.length; i++){
                if(!signs[i]){
                    answer -= absolutes[i];
                } else answer += absolutes[i];
            }
            return answer;

        }
}