package backjoon.minmax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = arr[0];
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                cnt = i;
            }
        }

        br.close();
        System.out.println(max);
        System.out.println(cnt+1);
    }

}
