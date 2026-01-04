class Solution {
    public int solution(int slice, int n) {
        int cnt = n / slice;
        
        if(n % slice != 0){
            cnt++;
        }

        return cnt;
    }
}