import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int val1 = 0;
        int val2 = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int A = arr[i];
                int B = arr[j];

                if (sum - (A + B) == 100) {
                    val1 = i;
                    val2 = j;
                    break;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != val1 && i != val2) {
                System.out.println(arr[i]);
            }
        }
    }
}