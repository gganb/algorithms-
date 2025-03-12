package backjoon.minmax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  바구니 개수 : N  넣는 횟수 : M
 *  i : 바구니 시작 번호 ( 1부터 시작 )
 *  j : 바구니 끝 번호
 *  k : 공의 번호
 * */
public class Main10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 바구니 개수
        int M = Integer.parseInt(st.nextToken());   // 넣는 획수

        int[] answer = new int[N];
        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());
            int K = Integer.parseInt(st2.nextToken());

            for (int j = I - 1; j < J; j++) {
                answer[j] = K;
            }
        }
        for (int a : answer) {
            System.out.print(a + " ");
        }

    }
}

