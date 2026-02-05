import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        read N
        arr = int[N]
        for i in 0..N-1:
            arr[i] = read int

        Arrays.sort(arr)

        for x in arr:
            bw.write(x)
            bw.newLine()
        bw.flush()
         */

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int x : arr) {
            bw.write(String.valueOf(x));
            bw.newLine();
        }
        bw.flush();
    }
}