package programmers.lessens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution12935 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(Arrays.toString(solution9.solution(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(solution9.solution(new int[]{10})));
    }
}

class Solution9 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if(arr.length == 1){
            return answer =  new int[]{-1};
        } else {
            List<Integer> arrlist = new ArrayList<>();

            for(int i : arr){
                arrlist.add(i);
            }

            arrlist.remove(Collections.min(arrlist));
            answer = new int[arr.length -1];

            for(int i = 0 ; i < answer.length; i++){
                answer[i] = arrlist.get(i);
            }
            return answer;
        }
    }
}