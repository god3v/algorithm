import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        char[] arr = {'D', 'C', 'B', 'A', 'E'};

        for (int i = 0; i < 3; i++) {
            st  = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int j = 0; j < 4; j ++) {
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println(arr[sum]);
        }
    }
}