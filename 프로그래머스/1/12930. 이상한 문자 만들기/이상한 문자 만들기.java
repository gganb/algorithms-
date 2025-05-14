class Solution {
    public String solution(String s) {
        // 짝수면 대문자, 홀수는 소문자로 변경

        String answer = "";
        String[] str = s.split("");
        
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(" ")){
                idx = 0;
                sb.append(" ");      
                continue;
            }
            if(idx % 2 == 0){
                sb.append(str[i].toUpperCase());
            } else {
                sb.append(str[i] = str[i].toLowerCase());
            }
            idx++;
        }
        
        return sb.toString();
    }
}