import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 1. 과목의 개수 N 을 입력받는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        // 2. 각 과목의 성적을 N 크기의 1차원 배열에 입력받는다.
        /*
        for (배열의 크기만큼 반복) {
            배열[i]에 각 점수 저장
        }
         */
        int sum = 0;
        int max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            int grade = Integer.parseInt(st.nextToken());
            sum += grade;
            if (max < grade) max = grade;
            arr[i] = grade;
        }

        // 3. 배열을 탐색하여 최고 점수와 점수의 총합을 구한다.

        // 4. 총합 * 100 / 최고 점수 / 과목의 수를 계산해 다시 계산한 점수의 평균 값을 출력한다.
        // sum * 100 / max / N
        System.out.println(sum * 100.0 / max / N);
    }
}