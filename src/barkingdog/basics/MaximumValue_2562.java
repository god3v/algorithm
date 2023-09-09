package barkingdog.basics;

import java.io.*;

public class MaximumValue_2562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int idx = 0;
        int max = -1;
        for (int i=1; i<=9; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value > max) {
                max = value;
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
