import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        if (A < B) {
            System.out.println(B - A - 1);
            for (long l = A + 1; l < B; l++) {
                System.out.print(l + " ");
            }
        }
        else if (A > B) {
            System.out.println(A - B - 1);
            for (long l = B + 1; l < A; l++) {
                System.out.print(l + " ");
            }
        }
        else {
            System.out.println(0);
        }
    }
}
