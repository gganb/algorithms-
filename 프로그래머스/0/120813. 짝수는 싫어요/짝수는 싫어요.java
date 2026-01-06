import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
             list.add(i);   
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}