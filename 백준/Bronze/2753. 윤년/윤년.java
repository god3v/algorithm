import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}