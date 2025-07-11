class Solution {
    public int[] solution(int n, int m) {
        int r = 0;
        int a = Math.max(n,m); // 최대값
        int b = Math.min(n,m); // 최소값
        
        
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
            
        int num = (n * m) / a;
        
        int[] answer = new int[]{a , num};
        return answer;
    }
}
