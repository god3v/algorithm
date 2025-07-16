import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 9;
        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int left = 0;
        int right = N - 1;

        int idx1 = 0;
        int idx2 = 0;

        while (left < right) {
            int A = arr[left];
            int B = arr[right];
            if (sum - (A + B) > 100) {
                left++;
            }
            else if (sum - (A + B) < 100) {
                right--;
            }
            else {
                idx1 = left;
                idx2 = right;
                break;
            }
        }
        /*

        int left = 0;
        int right = N - 1;

        int target = total - 100;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                for (int i = 0; i < N; i++) {
                    if (i == left || i == right) continue;
                    System.out.println(arr[i]);
                }
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
         */

        for (int i = 0; i < 9; i++) {
            if (i != idx1 && i != idx2) {
                System.out.println(arr[i]);
            }
        }
    }
}
