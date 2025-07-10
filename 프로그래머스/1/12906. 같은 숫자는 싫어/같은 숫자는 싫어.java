import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
  
        List<Integer> intlist = new ArrayList<>();
        intlist.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] == arr[i]){
                continue;
            } else intlist.add(arr[i]);
        }
        
        

        return intlist.stream().mapToInt(i -> i).toArray();
    }
}