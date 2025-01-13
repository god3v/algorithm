import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N: 재료의 개수, M: 갑옷이 되는 번호
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 재료 배열 저장
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 재료 배열 정렬
        Arrays.sort(arr);

        // 투 포인터 기법
        // while (i < j)
        // if (재료 합 < M) 작은 번호 재료를 한 칸 +
        // else if (재료 합 < M) 큰 번호 재료를 한 칸 -
        // else 경우의 수 증가, index 변경
        int i = 0;
        int j = N - 1;
        int count = 0;

        while (i < j) {
            if (arr[i] + arr[j] < M) {
                i++;
            } else if (arr[i] + arr[j] > M) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}