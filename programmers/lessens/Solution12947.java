package programmers.lessens;

public class Solution12947 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        boolean result = solution2.Solution2(11);
        System.out.println(result);
    }
}
class Solution2{
    public boolean Solution2(int x){
        int sum = 0;
        int setX = x;
        while(setX > 0){
            sum += setX % 10;
            setX /= 10;
        }
        return x % sum == 0;
    }
}