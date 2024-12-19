import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 소수인지 판별하는 boolean 배열 생성
        boolean[] prime = new boolean[N + 1];

        // 1은 소수가 아니므로 false
        // 2는 소수이므로 true
        for (int i=2; i<=N; i++) {
            prime[i] = true;
        }

        // 에라스토테네스의 체: 소수의 배수를 걸러낸다.
        // 특정 수의 제곱근보다 큰 소수의 배수는 특정 수를 넘어가기 때문에 제곱근보다 작은 수까지만 반복한다.
        for (int i=2; i*i<= N; i++) {
            for (int j=i+i; j<=N; j+=i) {
                prime[j] = false;
            }
        }

        for (int i=M; i<=N; i++) {
            if (prime[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
