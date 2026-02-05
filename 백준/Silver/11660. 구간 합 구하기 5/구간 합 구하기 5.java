import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        /*
        read N M
        D = int[N + 1][N + 1]

        for i in 1..N
            for j in 1..N
                read int
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + int

        for i in 0..M-1
            read X1, Y1, X2, Y2
            result = D[X2][Y2] - D[X1-1][Y2] - D[X2][Y1-1] + D[X1-1][Y1-1]
         */

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] D = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(st.nextToken());
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + num;
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int X1 = Integer.parseInt(st.nextToken());
            int Y1 = Integer.parseInt(st.nextToken());
            int X2 = Integer.parseInt(st.nextToken());
            int Y2 = Integer.parseInt(st.nextToken());

            int result = D[X2][Y2] - D[X1-1][Y2] - D[X2][Y1-1] + D[X1-1][Y1-1];
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();
    }
}