package programmers.lessens;

public class Solution12912 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(2,6));
    }
}
class Solution3{
    public long solution(int a, int b){
        int min = 0;
        int max = 0;
        int sum = 0;
        if(a > b){
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        for(int i = min; i <= max; i++){
            sum += i;
        }
        return sum;
    }

}