import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 두 수 입력받기
        // N = 바구니 개수, M = 변경 횟수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int ball[] = new int[N];

        for (int i = 0; i < N; i++) {
            ball[i] = i + 1;
        }

        int tmp = 0;
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            tmp = ball[i - 1];
            ball[i - 1] = ball[j - 1];
            ball[j - 1] = tmp;
        }
        
        for (int k = 0; k < N; k++) {
            bw.write(ball[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();

    }

}