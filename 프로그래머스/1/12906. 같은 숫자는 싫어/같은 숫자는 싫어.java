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
        
        int list[] = new int[intlist.size()];
        for(int i = 0; i < list.length; i++){
            list[i] = intlist.get(i);
        }
        

        return list;
    }
}