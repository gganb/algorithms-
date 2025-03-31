package programmers.lessens;

public class S12903 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        System.out.println(solution10.solution("12345"));
        System.out.println(solution10.solution("123456"));
    }
}
class Solution10{
    public String solution(String s){
        int size = s.length();

        StringBuilder sb = new StringBuilder();
        if(size % 2 == 0){
            sb.append(s.charAt(size/2 -1)).append(s.charAt(size/2));
        }else {
            sb.append(s.charAt((size+1)/2-1));
        }
        return sb.toString();
    }
}