package barkingdog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MakingFarm_6198 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<N; i++) {
            int h = Integer.parseInt(br.readLine());

            while (!stack.isEmpty() && stack.peek() <= h) {
                stack.pop();
            }
            stack.push(h);
            sum += stack.size() - 1;
            // 0 1 1 2 0 1
            // 5 3 2 4 9 7
        }
        System.out.println(sum);
    }
}
