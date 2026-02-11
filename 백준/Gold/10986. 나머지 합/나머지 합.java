import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] C = new long[M];
        C[0] = 1;

        long prefix = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            prefix += Long.parseLong(st.nextToken());
            int result = (int) (prefix % M);
            C[result]++;
        }

        long answer = 0;
        for (int i = 0; i < M; i++) {
            long c = C[i];
            answer += (c * (c - 1) / 2);
        }

        System.out.println(answer);
    }
}