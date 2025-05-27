import java.util.List;

class Solution {
    public int solution(String t, String p) {
        // p의 문자열 길이
        int strlen = p.length();
        int answer = 0;
        long pNum = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - strlen; i++){
            long num = Long.parseLong(t.substring(i,i+strlen));
            if(num <= pNum){
                answer++;
            }
        }
        return answer;
    }
}