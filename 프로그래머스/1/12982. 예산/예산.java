import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int cnt = 0;
        int D[] = d;
        Arrays.sort(D);
        
    
        for(int i = 0; i < D.length; i++){
            budget -= D[i];
            if(budget < 0){
                return cnt;
            }
            cnt++;
        }
        
        
        return cnt;
    }
}