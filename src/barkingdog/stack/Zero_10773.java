package barkingdog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero_10773 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i=0; i<K; i++) {
            int var = Integer.parseInt(br.readLine());

            if (var != 0) {
                sum += stack.push(var);
            } else {
                sum -= stack.pop();
            }
        }
        System.out.println(sum);
    }
}
