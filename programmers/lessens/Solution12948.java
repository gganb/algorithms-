package programmers.lessens;


public class Solution12948 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        String str = solution7.solution("01012341234");
        System.out.println(str);
    }
}

class Solution7{
    public String solution(String phone_number) {
        String str = phone_number;
        int size = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size - 4 ; i++){
            sb.append('*');
        }
        sb.append(str.substring(size-4 , size));

        return sb.toString();
    }
}