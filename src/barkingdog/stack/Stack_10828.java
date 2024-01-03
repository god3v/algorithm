package barkingdog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack_10828 {

    public static int[] stack;
    public static int idx = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        for (int i=0; i<N; i++) {

            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    sb.append(pop()).append("\n");
                    break;

                case "size" :
                    sb.append(size()).append("\n");
                    break;

                case "empty" :
                    sb.append(empty()).append("\n");
                    break;

                case "top" :
                    sb.append(top()).append("\n");
            }
        }
    }

    public static void push(int item) {
        stack[idx] = item;
        idx++;
    }

    public static int pop() {
        if (idx != 0) {
            int value = stack[idx - 1];
            stack[idx - 1] = 0;
            idx--;
            return value;
        } else {
            return -1;
        }
    }

    public static int size() {
        return idx;
    }

    public static int empty() {
        if (idx != 0)
            return 0;
        else
            return 1;
    }

    public static int top() {
        if (idx != 0)
            return stack[idx - 1];
        else
            return -1;
    }
}
