class Solution {
    public int[][] solution(int[] num_list, int n) {
        int cnt = num_list.length / n;
        int[][] answer = new int[cnt][n];
        
        for(int i = 0; i < cnt; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[i * n + j];
            }
        }
        return answer;
    }
}