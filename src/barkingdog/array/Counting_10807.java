package barkingdog.array;

import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class Counting_10807 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());
        int count = 0;

        for (int var : arr) {
            if (var == v)
                count++;
        }
        System.out.println(count);
    }
}
