import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
    Y = 30초에 10원
    M = 60초에 15원

    출력: 싼 요금제 청구금액
    같은 경우 Y M 금액
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int ySum = 0;
        int mSum = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int sec = Integer.parseInt(st.nextToken());

            int y = sec / 30 + 1;
            ySum += y * 10;

            int m = sec / 60 + 1;
            mSum += m * 15;

//            System.out.println("sec: " + sec + ", y: " + y + ", m: " + m);
        }

        if (ySum < mSum) {
            System.out.println("Y " + ySum);
        } else if (ySum > mSum){
            System.out.println("M " + mSum);
        } else {
            System.out.println("Y M " + ySum);
        }
    }
}
