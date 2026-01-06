class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        // 빈도 세기
        for(int x : array){
            count[x]++;
        }
        // 최빈값 구하기
        int max = 0;
        for(int y : count){
            if(y > max){
                max = y;
            }
        }
        
        int answer = 0;
        int maxCount = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] == max){
                maxCount++;
                answer = i;
            }
        }
        if(maxCount > 1){
            answer = -1;
        }
        return answer;
    }
}