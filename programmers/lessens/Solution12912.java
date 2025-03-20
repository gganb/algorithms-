package programmers.lessens;

public class Solution12912 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(2,6));
    }
}
class Solution3{
    public long solution(int a, int b){
        return sumAtoB(Math.min(a,b),Math.max(b,a));
    }
    public long sumAtoB(long a, long b){
        return (b - a + 1) * (a + b) / 2;
    }

}