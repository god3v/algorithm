import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 수열의 개수, M: 나눌 수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // S: 합 배열, C: 나머지 인덱스 배열
        long[] S = new long[N];
        long[] C = new long[M];

        // 합 배열 저장
        st = new StringTokenizer(br.readLine());

        S[0] = Integer.parseInt(st.nextToken());
        for (int i=1; i<N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        long answer = 0;

        // 합 배열 M 으로 나눈 나머지 값
        for (int i=0; i<N; i++) {
            int tmp = (int) (S[i] % M);
            if (tmp == 0) answer++;
            C[tmp]++;
        }

        // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 더하기
        for (int i=0; i<M; i++) {
            if (C[i] > 1) {
                answer = answer + (C[i] * (C[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}