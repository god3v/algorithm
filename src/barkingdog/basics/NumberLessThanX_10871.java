package barkingdog.basics;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberLessThanX_10871 {
/*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int X = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            int val = in.nextInt();
            if (val < X) {
                sb.append(val + " ");
            }
        }

        System.out.println(sb);
    }
 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value < X) {
                bw.write(value + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
