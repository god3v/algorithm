package barkingdog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StachNumbers_1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = 1;
        boolean result = true;

        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<n; i++) {
            int var = arr[i];

            if (var >= num) {

                while (var >= num) {
                    stack.push(num++);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            } else {
                int top = stack.pop();
                if (top > var) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-").append("\n");
                }
            }
        }
        if (result) System.out.println(sb);
    }
}
